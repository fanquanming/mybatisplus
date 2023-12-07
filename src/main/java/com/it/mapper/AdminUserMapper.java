package com.it.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.it.po.AdminUserPO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description:
 * @Author: Fountain
 * @Date: 2023/12/7
 */
@Mapper
public interface AdminUserMapper extends BaseMapper<AdminUserPO> {
}

