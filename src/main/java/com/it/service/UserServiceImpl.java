package com.it.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.it.mapper.UserMapper;
import com.it.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: Fountain
 * @Date: 2023/12/7
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public void test() {

        User user = userMapper.selectById("2");
        //nuser.setId();
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("name","范泉明1");
        List<User> list = userMapper.selectList(queryWrapper);
        System.out.println(list);
    }
}
