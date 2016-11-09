package com.wenhao.netshop.dao;

import com.wenhao.netshop.domain.Permission;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by lenovo on 2016/11/08.
 */
public interface PermissionsRepository extends CrudRepository<Permission, Long> {
}
