package com.wenhao.netshop.dao;

import com.slyak.spring.jpa.GenericJpaRepository;
import com.slyak.spring.jpa.GenericJpaRepositoryFactory;
import com.slyak.spring.jpa.GenericJpaRepositoryImpl;
import com.slyak.spring.jpa.TemplateQuery;
import com.wenhao.netshop.domain.User;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by lw on 2016/11/9.
 */
@EnableJpaRepositories(basePackages ="com.wenhao.netshop.dao",repositoryBaseClass = GenericJpaRepositoryImpl.class, repositoryFactoryBeanClass = GenericJpaRepositoryFactory.class )
public interface UserDao extends GenericJpaRepository<User, Long> {
    @TemplateQuery
    User findUser(String username);

}
