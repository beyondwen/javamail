package com.wenhao.netshop.dao;

import com.wenhao.netshop.BaseTest;
import com.wenhao.netshop.domain.Role;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by lenovo on 2016/11/08.
 */
public class RoleRepositoryTest extends BaseTest {

    @Autowired
    private RolesRepository rolesRepository;

    @Test
    public void saveTest() {
        Role role = new Role();
        role.setRolename("管理员");
        rolesRepository.save(role);
    }

}