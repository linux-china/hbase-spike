package org.mvnsearch.hbase;

import org.apache.hadoop.hbase.KeyValue;
import org.apache.hadoop.hbase.client.Result;
import org.springframework.data.hadoop.hbase.RowMapper;

import java.util.List;

/**
 * user row mapper
 *
 * @author linux_china
 */
public class UserRowMapper implements RowMapper<User> {
    @Override
    public User mapRow(Result result, int i) throws Exception {
        User user = new User();
        user.setId(new String(result.getRow()));
        List<KeyValue> nick = result.getColumn("cf".getBytes(), "nick".getBytes());
        if (!nick.isEmpty()) {
            user.setNick(new String(nick.get(0).getValue()));
        }
        List<KeyValue> email = result.getColumn("cf".getBytes(), "email".getBytes());
        if (!email.isEmpty()) {
            user.setEmail(new String(email.get(0).getValue()));
        }
        return user;
    }
}
