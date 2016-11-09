package com.wenhao.netshop.dao;

import com.wenhao.netshop.BaseTest;
import com.wenhao.netshop.domain.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

/**
 * Created by lw on 2016/11/8.
 */
public class UserMapperTest extends BaseTest {
    @Autowired
    private UsersRepository repository;

    @Test
    public void saveTest() {
        User user = new User();
        user.setUsername("wenhao");
        user.setPassword("12345");
        repository.save(user);
        //repository.delete(1L);
        //User users = repository.findByUsername("wenhao1");
        //System.out.println(users);
    }

    public void findTest() {
        repository.findAll();
    }

}