package org.mvnsearch.hbase;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * user class
 *
 * @author linux_china
 */
@Entity(name = "User2")
@Table(name = "cf", schema = "user@demo_pu")
public class User {
    @Id
    private String id;
    @Column(name = "nick")
    private String nick;
    @Column(name = "email")
    private String email;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
