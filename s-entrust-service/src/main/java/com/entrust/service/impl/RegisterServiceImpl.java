package com.entrust.service.impl;

import com.entrust.common.monitor.Monitor;
import com.entrust.dao.UserMapper;
import com.entrust.domain.entity.User;
import com.entrust.service.RegisterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 注册服务
 * Created by lixiaohan on 2018/4/18.
 */
@Slf4j
@Service
public class RegisterServiceImpl implements RegisterService {
    @Resource
    private UserMapper userMapper;

    @Override
    @Monitor(key = "registerService.register")
    public boolean register(User user) {
        log.info("register");
        throw new RuntimeException("Test");
    }
}
