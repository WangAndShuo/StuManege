package com.sxf.mapper;

import org.apache.ibatis.annotations.*;


@Mapper
public interface UserDao {
   @Select("select username from userr where id = #{id}")
    String findById(Integer id);
}
