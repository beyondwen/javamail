package com.wenhao.netshop.dao;

import com.wenhao.netshop.BaseTest;
import com.wenhao.netshop.domain.Permissions;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by lenovo on 2016/11/08.
 */
public class PermissionsRepositoryTest extends BaseTest {

    @Autowired
    private PermissionsRepository permissionsRepository;

    @Test
    public void saveTest() {
        Permissions permissions = new Permissions();
        permissions.setPermissionname("system:create");
        permissionsRepository.save(permissions);
    }
}