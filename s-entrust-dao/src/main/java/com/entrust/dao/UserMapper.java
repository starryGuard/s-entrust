package com.entrust.dao;

import com.entrust.domain.entity.User;
import org.springframework.stereotype.Repository;

/**
 * 用户DAO接口
 * Created by lixiaohan on 2018/4/16.
 */
@Repository
public interface UserMapper {
    int insertUser(User user);
}
