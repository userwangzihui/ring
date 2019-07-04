package com.j1902.shopping.mapper;

import com.j1902.shopping.model.OrdersQv;
import com.j1902.shopping.pojo.CountOrder;
import com.j1902.shopping.pojo.CountOrderExample;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
public interface CountOrderMapper {
    long countByExample(CountOrderExample example);

    List<OrdersQv> selectBySta(@Param(value = "sta") String id);

    int deleteByExample(CountOrderExample example);

    int deleteByPrimaryKey(Integer countId);

    int insert(CountOrder record);

    int insertSelective(CountOrder record);

    int insertByKey(CountOrder record);

    List<CountOrder> selectByExample(CountOrderExample example);

    CountOrder selectByPrimaryKey(Integer countId);

    int updateByExampleSelective(@Param("record") CountOrder record, @Param("example") CountOrderExample example);

    int updateByExample(@Param("record") CountOrder record, @Param("example") CountOrderExample example);

    int updateByPrimaryKeySelective(CountOrder record);

    int updateByPrimaryKey(CountOrder record);
}