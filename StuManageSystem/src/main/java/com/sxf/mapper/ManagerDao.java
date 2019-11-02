package com.sxf.mapper;


import com.sxf.entity.Manager;
import org.apache.ibatis.annotations.*;


@Mapper
public interface ManagerDao {
    @Insert("insert into manager values('#{username}','#{number}')")
    void add(String username, String number);

    @Delete("delete manager where mid = #{mid}")
    void del(Integer mid);

    @Update("update manager set username = #{username},password = #{password} where mid = #{mid}")
    void edit(Integer mid, String username, String password);

    @Select("select * from manager where mid = #{mid}")
    Manager find1(Integer mid);

    @Select("select * from manager")
    Manager[] findAll();

    @Select("select * from manager where username = #{username}")
    Manager find(String username);


}
