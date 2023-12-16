package com.it.rest;

import com.it.po.AdminUserLoginDTO;
import com.it.po.AdminUserLoginVO;
import com.it.service.AdminUserService;
import com.it.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: Fountain
 * @Date: 2023/12/7
 */
@RestController
@RequestMapping("/test")
public class AdminUserController {
    @Autowired
    private AdminUserService adminUserService;

    @Autowired
    private UserService userService;

    @PostMapping(value = "/login/password")
    public AdminUserLoginVO passLogin(@RequestBody() AdminUserLoginDTO dto){
        AdminUserLoginVO vo = adminUserService.passLogin(dto);
        return vo;
    }

    @PostMapping(value = "/mybatisplus1")
    public void mybatisPlus(){
        userService.test();
        System.out.println("我改了东西，并且我还要切换分支你怎么说");
    }

    @PostMapping(value = "/mybatisplus")
    public void mybatisPlusDev01(){
        userService.test();

    }


}

