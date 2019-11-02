package com.sxf.service;


import com.sxf.mapper.UserDao;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;


@Service
public class UserService {

    //@Autowired
    private UserDao userDao;


    public String findById(int i) {
        return userDao.findById(i);
    }
}
