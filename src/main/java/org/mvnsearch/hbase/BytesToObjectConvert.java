package org.mvnsearch.hbase;

import org.apache.hadoop.hbase.util.Bytes;

import java.util.Date;

/**
 * bytes to object convert
 *
 * @author linux_china
 */
public class BytesToObjectConvert {

    @SuppressWarnings("unchecked")
    public static <T> T convert(Class<T> clazz, byte[] value) {
        if (clazz == String.class) {
            return (T) Bytes.toString(value);
        } else if (clazz == Integer.class) {
            return (T) Integer.valueOf(Bytes.toInt(value));
        } else if (clazz == Long.class) {
            return (T) Long.valueOf(Bytes.toLong(value));
        } else if (clazz == Double.class) {
            return (T) Double.valueOf(Bytes.toDouble(value));
        } else if (clazz == Date.class) {
            return (T) (new Date(Bytes.toLong(value)));
        }
        return null;
    }

}
