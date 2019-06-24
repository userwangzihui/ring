package com.j1902.shopping.service.impl;

import com.j1902.shopping.mapper.AdminMapper;
import com.j1902.shopping.pojo.Admin;
import com.j1902.shopping.pojo.AdminExample;
import com.j1902.shopping.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminMapper adminmapp;

    @Override
    public boolean getByName(Admin admin) {
        AdminExample adminExample = new AdminExample();
        AdminExample.Criteria criteria = adminExample.or();
        criteria.andAdminNameEqualTo(admin.getAdminName());
        List<Admin> admins = adminmapp.selectByExample(adminExample);
        if (admins!=null&&admins.size()>0){
            return admins.get(0).getAdminPwd().equals(admin.getAdminPwd());
        }
        return false;
    }
}
