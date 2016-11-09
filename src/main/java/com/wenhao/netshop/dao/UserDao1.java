package com.wenhao.netshop.dao;

import com.wenhao.netshop.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by lw on 2016/11/9.
 */
public interface UserDao1 extends JpaRepository<User, Long> {

    List<String> findByUser(String username);
}
