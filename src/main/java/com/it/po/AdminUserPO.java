package com.it.po;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.util.Date;

/**
 * @Description:
 * @Author: Fountain
 * @Date: 2023/12/7
 */
@Data
@TableName("")
public class AdminUserPO {


    private Long id;


    private String userName;


    private String phone;


    private String password;


    private Date registerTime;


    private Boolean isCancellation;


    private Long version;

}




