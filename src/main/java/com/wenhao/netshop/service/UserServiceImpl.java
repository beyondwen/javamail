package com.wenhao.netshop.service;

import com.wenhao.netshop.dao.UsersRepository;
import com.wenhao.netshop.domain.Permission;
import com.wenhao.netshop.domain.Role;
import com.wenhao.netshop.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.*;

/**
 * Created by lw on 2016/11/9.
 */
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersRepository usersRepository;
}
