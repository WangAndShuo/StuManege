package com.sxf.service.Impl;

import com.sxf.entity.Manager;
import com.sxf.mapper.ManagerDao;
import com.sxf.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerServiceImpl implements ManagerService {

    //@Autowired
    private ManagerDao managerDao;

    @Override
    public Manager find(String username) {

        return managerDao.find(username);
    }

    @Override
    public void add(String username, String number){
        managerDao.add(username,number);
    }
    @Override
    public void del(Integer mid){
        managerDao.del(mid);
    }
    @Override
    public void edit(Integer mid , String username, String password){
        managerDao.edit(mid,username,password);
    }


}
