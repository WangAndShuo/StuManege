package com.sxf.service;


import com.sxf.entity.Manager;

public interface ManagerService {
    Manager find(String username);
    void add(String username, String number);
    void del(Integer mid);
    void edit(Integer mid, String username, String password);

}
