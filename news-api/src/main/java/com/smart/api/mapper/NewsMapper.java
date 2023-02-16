package com.smart.api.mapper;

import com.smart.api.model.News;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface NewsMapper {
    @Select("select * from news where id = #{id}")
    @Results({
        @Result(property = "CreatedTime", column = "created_time")
    })
    News get(int id);
}
