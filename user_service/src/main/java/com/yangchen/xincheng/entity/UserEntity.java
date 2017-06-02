package com.yangchen.xincheng.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by yangchen on 2017/6/2.
 */
@Entity
@Table(name = "XC_USER")
public class UserEntity extends AbstractAuditEntity{

    @Column(unique = true, nullable = false, length = 64)
    private String userName;

    @Column(nullable = false, length = 64)
    private String password;

    @Column(unique = true, nullable = false)
    private long phone;

    @Column(unique = true, length = 128)
    private String email;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
