package com.wenhao.netshop.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by lenovo on 2016/11/08.
 */
@Entity
public class Role implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String rolename;

    @ManyToMany
    @JoinTable(name = "role_permission", joinColumns = {@JoinColumn(name = "role_id")}, inverseJoinColumns = {@JoinColumn(name = "permission_id")})
    private Set<Permission> permissionses;

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

    public Set<Permission> getPermissionses() {
        return permissionses;
    }

    public void setPermissionses(Set<Permission> permissionses) {
        this.permissionses = permissionses;
    }
}
