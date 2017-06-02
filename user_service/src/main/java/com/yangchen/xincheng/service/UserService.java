package com.yangchen.xincheng.service;

import com.yangchen.xincheng.entity.UserEntity;
import com.yangchen.xincheng.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yangchen on 2017/6/2.
 */
@Service
public class UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    UserRepository userRepository;

    public String register(UserEntity user) {

        if (user == null) {
            logger.error("User is NULL.");
            return "User is empty. ";
        }

        if (userRepository.findByUserName(user.getUserName()) != null) {
            return "Username already existing. ";
        }
        if (userRepository.findByEmail(user.getEmail()) != null) {
            return "Email already existing. ";
        }
        if (userRepository.findByPhone(user.getPhone()) != null) {
            return "Phone already existing. ";
        }

        userRepository.save(user);

        return "Register successfully.";
    }
}
