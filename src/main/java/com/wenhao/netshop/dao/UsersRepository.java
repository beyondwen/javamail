package com.wenhao.netshop.dao;

import com.wenhao.netshop.domain.Users;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by lw on 2016/11/8.
 */
public interface UsersRepository extends CrudRepository<Users,Long> {
    Users findByUsername(String username);
}
