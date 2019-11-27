package com.model;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="user")
public class t_user {
    @Id
    private String logname;
    private String password;
    private String email;

    public String getLogname() {
        return logname;
    }

    public void setLogname(String logname) {
        this.logname = logname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
