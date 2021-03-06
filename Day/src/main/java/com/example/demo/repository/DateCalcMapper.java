package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.model.DateCalc;

@Mapper
public interface DateCalcMapper {

    //select全件
    @Select("select * from DateCalc")
    public List<DateCalc> selectAll();

    //select１件
    @Select("SELECT * FROM DateCalc where id = #{id}")
    public DateCalc selectOne(int id);

    //新規登録
    @Insert("insert into DateCalc  (name, plusyear, plusmonth, plusday) values (#{name}, #{plusyear}, #{plusmonth}, #{plusday})")
    public void insertOne(DateCalc dateCalc);

    //更新
    @Update("update DateCalc set name = #{name}, plusyear = #{plusyear}, plusmonth = #{plusmonth}, plusday = #{plusday} where id = #{id}")
    public void updateOne(DateCalc dateCalc);

    //削除
    @Delete("delete from DateCalc where id = #{id}")
    public void deleteOne(DateCalc dateCalc);

}

