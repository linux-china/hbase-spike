package org.mvnsearch.hbase;

import org.apache.hadoop.hbase.KeyValue;
import org.apache.hadoop.hbase.client.Result;
import org.springframework.data.hadoop.hbase.RowMapper;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * JPA row mapper
 *
 * @author linux_china
 */
public class JpaRowMapper<T> implements RowMapper<T> {
    private Class clazz;
    private byte[] columnFamily;
    private String table;
    private Map<byte[], Method> columns = new HashMap<>();
    private Method idMethod;

    public JpaRowMapper(Class<T> clazz) {
        this.clazz = clazz;
        Table tableAnnotation = clazz.getAnnotation(Table.class);
        this.columnFamily = tableAnnotation.name().getBytes();
        this.table = tableAnnotation.schema();
        if (this.table != null && this.table.contains("@")) {
            this.table = table.substring(0, table.indexOf("@"));
        }
        for (Field field : clazz.getDeclaredFields()) {
            String fieldName = field.getName();
            String setterName = "set" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
            Column columnAnnotation = field.getAnnotation(Column.class);
            if (field.getAnnotation(Id.class) != null) {
                try {
                    this.idMethod = this.clazz.getMethod(setterName, field.getType());
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                }
            } else if (columnAnnotation != null) {
                try {
                    columns.put(columnAnnotation.name().getBytes(), this.clazz.getMethod(setterName, field.getType()));
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public T mapRow(Result result, int rowNum) throws Exception {
        T obj = (T) clazz.newInstance();
        for (Map.Entry<byte[], Method> entry : columns.entrySet()) {
            byte[] columnName = entry.getKey();
            Method setter = entry.getValue();
            List<KeyValue> column = result.getColumn(columnFamily, columnName);
            if (column != null && !column.isEmpty()) {
                byte[] value = column.get(0).getValue();
                Class<?> valueType = setter.getParameterTypes()[0];
                setter.invoke(obj, BytesToObjectConvert.convert(valueType, value));
            }
        }
        return obj;
    }

}
