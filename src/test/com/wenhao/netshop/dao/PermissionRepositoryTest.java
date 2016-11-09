package com.wenhao.netshop.dao;

import com.wenhao.netshop.BaseTest;
import com.wenhao.netshop.domain.Permission;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by lenovo on 2016/11/08.
 */
public class PermissionRepositoryTest extends BaseTest {

    @Autowired
    private PermissionsRepository permissionsRepository;

    @Test
    public void saveTest() {
        Permission permission = new Permission();
        permission.setPermissionname("system:create");
        permissionsRepository.save(permission);
    }
}