package com.it.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Description:
 * @Author: Fountain
 * @Date: 2023/12/7
 */
@Data
@TableName("`user`")
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}

