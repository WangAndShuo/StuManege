package com.sxf.mapper;

import com.sxf.entity.Classs;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
public interface ClassDao {

    @Select("select * from class where cid = #{cid}")
    Classs find(Integer cid);



}
