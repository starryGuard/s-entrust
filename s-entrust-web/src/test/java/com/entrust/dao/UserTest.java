package com.entrust.dao;

import com.entrust.BaseTest;
import com.entrust.domain.entity.User;
import com.entrust.service.RegisterService;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.Date;

/**
 * 用户Dao测试类
 * Created by lixiaohan on 2018/4/17.
 */
public class UserTest extends BaseTest {

    @Resource
    private RegisterService registerService;
    @Resource
    private UserMapper userMapper;

    @Test
    public void register() {
        registerService.register(new User());
    }

    @Test
    public void insertUserTest(){
        User user = new User();
        user.setUsername("StarryGuard");
        user.setPassword("123");
        user.setType(1);
        user.setCreateTime(new Date());
        user.setModifyTime(new Date());
        userMapper.insertUser(user);
    }
}
