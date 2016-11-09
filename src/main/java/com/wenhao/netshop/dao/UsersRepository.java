package com.wenhao.netshop.dao;

import com.wenhao.netshop.domain.Permission;
import com.wenhao.netshop.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by lw on 2016/11/8.
 */
public interface UsersRepository extends JpaRepository<User, Long>{
    User findByUsername(String username);
}
