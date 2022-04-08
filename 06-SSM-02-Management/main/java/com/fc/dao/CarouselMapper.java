package com.fc.dao;

import com.fc.entity.Carousel;
import com.fc.entity.CarouselExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CarouselMapper {


   Boolean setState(@Param("id") Long id);

    long countByExample(CarouselExample example);

    int deleteByExample(CarouselExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Carousel record);

    int insertSelective(Carousel record);

    List<Carousel> selectByExample(CarouselExample example);

    Carousel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Carousel record, @Param("example") CarouselExample example);

    int updateByExample(@Param("record") Carousel record, @Param("example") CarouselExample example);

    int updateByPrimaryKeySelective(Carousel record);

    int updateByPrimaryKey(Carousel record);
}