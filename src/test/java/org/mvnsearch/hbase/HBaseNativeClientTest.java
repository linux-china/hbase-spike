package org.mvnsearch.hbase;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.KeyValue;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.util.Bytes;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

/**
 * hbase native client test
 *
 * @author linux_china
 */
public class HBaseNativeClientTest {
    private static HTable userTable;

    @BeforeClass
    public static void setUp() throws Exception {
        Configuration conf = HBaseConfiguration.create();
        conf.set("hbase.zookeeper.quorum", "localhost");
        userTable = new HTable(conf, "user");
    }

    @Test
    public void testSpike() throws Exception {
        Result result = userTable.get(new Get(Bytes.toBytes("1")));
        List<KeyValue> column = result.getColumn(Bytes.toBytes("cf"), Bytes.toBytes("nick"));
        byte[] value = column.get(0).getValue();
        System.out.println(new String(value));
        userTable.close();
    }

    @AfterClass
    public static void tearDown() throws Exception {
        if (userTable != null) {
            userTable.close();
        }
    }
}
