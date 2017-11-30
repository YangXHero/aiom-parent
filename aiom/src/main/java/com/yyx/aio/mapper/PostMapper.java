package com.yyx.aio.mapper;

import com.yyx.aio.common.pageInfo.PageInfo;
import com.yyx.aio.entity.Post;

import java.util.List;

public interface PostMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Post record);

    int insertSelective(Post record);

    Post selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Post record);

    int updateByPrimaryKey(Post record);

    List<Post> selectPostListByInfo(Post post, PageInfo pageInfo);
}