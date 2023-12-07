package com.it.service;

import com.it.po.AdminUserLoginDTO;
import com.it.po.AdminUserLoginVO;

public interface AdminUserService {
    AdminUserLoginVO passLogin(AdminUserLoginDTO dto);
}
