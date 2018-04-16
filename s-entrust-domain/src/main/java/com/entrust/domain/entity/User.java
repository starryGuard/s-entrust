package com.entrust.domain.entity;

import lombok.Data;

/**
 * 用户信息
 * Created by lixiaohan on 2018/4/12.
 */
@Data
public class User {
    /**
     * 主键ID
     */
    private Long id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 昵称
     */
    private String nick;
    /**
     * email
     */
    private String email;
    /**
     * 电话
     */
    private String phone;
    /**
     * 用户类型
     */
    private String type;
    /**
     * 头像
     */
    private String avatarImg;
    /**
     * 性别
     */
    private String gender;
    /**
     * 注册IP
     */
    private String registerIP;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 更新时间
     */
    private String modifyTime;
    /**
     * 是否有效
     */
    private Integer yn;
}
