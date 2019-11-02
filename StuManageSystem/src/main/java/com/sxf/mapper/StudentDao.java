package com.sxf.mapper;


import com.sxf.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
public interface StudentDao {
    @Select("select * from student where sid = #{sid}")
    Student find(Integer sid);
}
