package com.wenhao.netshop.dao;

import com.wenhao.netshop.BaseTest;
import com.wenhao.netshop.domain.Users;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by lw on 2016/11/8.
 */
public class UsersDaoTest extends BaseTest {
    @Autowired
    private UsersRepository repository;

    @Test
    public void saveTest() {
        Users user = new Users();
        user.setUsername("wenhao");
        user.setPassword("12345");
        //repository.save(user);
        //repository.delete(1L);
        Users users = repository.findByUsername("wenhao1");
        System.out.println(users);
    }

}