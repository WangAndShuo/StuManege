package com.sxf.mapper;



import com.sxf.entity.StudentClass;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
public interface StudentClassDao {
    @Insert("insert into studentclass values(#{sid},#{cid},'#{sname}','#{cname}')")
    void add(Integer sid, Integer cid, String sname, String cname);

@Delete("delete from studentclass where id = #{id}")
    void del(Integer id);
@Select("select * from studentclass where id = #{id}")
StudentClass find(Integer id);

@Select("select * from studentclass")
    StudentClass[] findAll();

}
