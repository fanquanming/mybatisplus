package com.it.po;

import lombok.Data;

import java.util.Date;

/**
 * @Description:
 * @Author: Fountain
 * @Date: 2023/12/7
 */
@Data
public class AdminUserLoginVO {
    //    @ApiModelProperty("令牌")
//    private String token;

    private Long id;

    private String userName;

    private String phone;

    private Date registerTime;

}

