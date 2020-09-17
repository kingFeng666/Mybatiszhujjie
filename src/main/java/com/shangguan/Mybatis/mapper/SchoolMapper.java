package com.shangguan.Mybatis.mapper;

import com.shangguan.Mybatis.beans.School;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface SchoolMapper {
    @Delete("delete from school where sid=#{sid}")

    int deleteByPrimaryKey(@Param("sid") Integer sid);

    @Insert("insert into school( sname, sdescription, saddress) values (#{sName},#{sDescription},#{sAddress})")

    int insert(School record);

    int insertSelective(School record);

    School selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(School record);

    int updateByPrimaryKey(School record);
}