package com.wenhao.netshop.dao;

import com.wenhao.netshop.BaseTest;
import com.wenhao.netshop.domain.Roles;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by lenovo on 2016/11/08.
 */
public class RolesRepositoryTest extends BaseTest {

    @Autowired
    private RolesRepository rolesRepository;

    @Test
    public void saveTest() {
        Roles roles = new Roles();
        roles.setRolename("管理员");
        rolesRepository.save(roles);
    }

}