package com.wenhao.netshop.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by lenovo on 2016/11/08.
 */
@Entity
public class Permissions implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String permissionname;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPermissionname() {
        return permissionname;
    }

    public void setPermissionname(String permissionname) {
        this.permissionname = permissionname;
    }
}
