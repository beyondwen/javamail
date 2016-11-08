package com.wenhao.netshop.domain;

import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by lenovo on 2016/11/08.
 */
@Entity
public class Roles implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String rolename;

    @ManyToMany
    @JoinTable(name = "role_permissions", joinColumns = {@JoinColumn(name = "role_id")}, inverseJoinColumns = {@JoinColumn(name = "permissions_id")})
    private Set<Permissions> permissionses;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public Set<Permissions> getPermissionses() {
        return permissionses;
    }

    public void setPermissionses(Set<Permissions> permissionses) {
        this.permissionses = permissionses;
    }
}
