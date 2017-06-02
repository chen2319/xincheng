package com.yangchen.xincheng.repository;

import com.yangchen.xincheng.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by yangchen on 2017/6/2.
 */
public interface UserRepository extends JpaRepository<UserEntity, String> {
    UserEntity findByUserName(@Param("userName") String userName);

    UserEntity findByPhone(@Param("phone") long phone);

    UserEntity findByEmail(@Param("email") String email);


}
