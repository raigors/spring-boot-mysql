package com.github.mysql.controller;

import com.github.mysql.pojo.UserInfoDO;
import com.github.mysql.repository.IUserInfoRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 创建时间为 下午4:08 2019/11/21
 * 项目名称 spring-boot-mysql
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

@RestController
public class UserInfoController {

    @Resource
    private IUserInfoRepository repository;

    @PostMapping("/user_info")
    public UserInfoDO save(@RequestBody UserInfoDO userInfoDO) {
        return repository.save(userInfoDO);
    }


}
