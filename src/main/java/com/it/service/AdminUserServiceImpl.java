package com.it.service;

import com.it.mapper.AdminUserMapper;
import com.it.po.AdminUserLoginDTO;
import com.it.po.AdminUserLoginVO;
import com.it.po.AdminUserPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: Fountain
 * @Date: 2023/12/7
 */
@Service
public class AdminUserServiceImpl implements AdminUserService{
    @Autowired
    private AdminUserMapper adminUserMapper;

    @Override
    public AdminUserLoginVO passLogin(AdminUserLoginDTO dto) {
        //todo 数据效验
//        LambdaQueryWrapper<AdminUserPO> wrapper = new LambdaQueryWrapper<>();
//        wrapper.eq(AdminUserPO::getPhone, dto.getPhone())
//                .eq(AdminUserPO::getIsCancellation,false);
//        AdminUserPO po = adminUserMapper.selectOne(wrapper);
//        if (po == null) {
//            throw new RuntimeException("手机号未注册");
//        }
//        if (!po.getPassword().equals(dto.getPassword())) {
//            throw new RuntimeException("密码错误");
//        }
//        AdminUserLoginVO vo = new AdminUserLoginVO();
//        vo.setId(po.getId());
//        vo.setPhone(po.getPhone());
//        vo.setUserName(po.getUserName());
//        vo.setRegisterTime(po.getRegisterTime());
//        return vo;

        return new AdminUserLoginVO();
    }
}

