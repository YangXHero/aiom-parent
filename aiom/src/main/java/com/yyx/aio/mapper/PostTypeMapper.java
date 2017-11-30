package com.yyx.aio.mapper;

import com.yyx.aio.entity.PostType;

public interface PostTypeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PostType record);

    int insertSelective(PostType record);

    PostType selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PostType record);

    int updateByPrimaryKey(PostType record);
}