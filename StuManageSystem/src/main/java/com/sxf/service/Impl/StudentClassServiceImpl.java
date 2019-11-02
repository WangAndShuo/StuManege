package com.sxf.service.Impl;

import com.sxf.mapper.ClassDao;
import com.sxf.mapper.StudentClassDao;
import com.sxf.mapper.StudentDao;
import com.sxf.service.StudentClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentClassServiceImpl implements StudentClassService {

   // @Autowired
    StudentClassDao studentClassDao;
   // @Autowired
    StudentDao studentDao;
  //  @Autowired
    ClassDao classDao;
    public void add(Integer sid, Integer cid) {


    }
    public void del(Integer id){

    }




}
