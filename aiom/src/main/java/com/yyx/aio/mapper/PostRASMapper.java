package com.yyx.aio.mapper;

import com.yyx.aio.entity.PostRAS;

public interface PostRASMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PostRAS record);

    int insertSelective(PostRAS record);

    PostRAS selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PostRAS record);

    int updateByPrimaryKey(PostRAS record);
}