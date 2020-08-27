package com.irzx.itzxserviceprovideer.service.service;

import com.irzx.itzxserviceprovideer.service.mapper.UserMapper;
import com.irzx.itzxserviceprovideer.service.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author  张祥
 */
@Service
public class UserService {
    @Autowired
    public UserMapper userMapper;

    public User queryUserById(Long id){

        return this.userMapper.selectByPrimaryKey(id);
    }
}
