package com.qk.dao;

import com.qk.po.Dog;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author samasung
 * @create 2020-10-01-8:57
 */
public interface DogDao {
   /**
   * 查询全部
   * @return
    * @param
   * */
    @Select("select *from dog")
    @Results(id="dogResult", value ={
            @Result (id=true, property="id",column = "id"),
            @Result(property = "name",column = "name"),
            @Result(property = "love",column = "love"),
            @Result (property = "type",column = "type")
    } )
    List<Dog> selectAll();
    /**
    * 根据id查询
    * @return
     * @param id 编号
    * */
    @Select("select * from dog where id=#{id}")
    @ResultMap("dogResult")
    Dog selectOne(int id);
    /**
    * 删除
     * @return
     * @param  id 编号
    * */
    @Delete("delete from dog where id=#{id}")
    int delete(int id);
    /**
    * 添加
     * @return
     * @param dog 对象
    * */
    @Insert("insert into dog(name,love,type) values(#{name},#{love},#{type})")
    int  insert(Dog dog);
    /**
    * 修改
     * @return
     * @param dog 对象
    * */
    @Update("update dog set name=#{name},love=#{love},type=#{type} where id=#{id}")
    int update(Dog dog);

}
