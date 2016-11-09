package com.wenhao.netshop.dao;

import com.wenhao.netshop.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by lw on 2016/11/9.
 */
public class UserDaoTest extends BaseTest {

    @Autowired
    private UserDao dao;

    @Test
    public void findRolebyName() throws Exception {
        dao.findUser("wenhao");
    }

}