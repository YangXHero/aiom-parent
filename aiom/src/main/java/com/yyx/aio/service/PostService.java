package com.yyx.aio.service;
import com.yyx.aio.common.pageInfo.PageInfo;
import com.yyx.aio.entity.Post;

import java.util.List;

/**
 * @author wuwei
 * @time 2017 11 30
 */
public interface PostService {
    List<Post> getPostListByInfo(Post post, PageInfo pageInfo);

    int deletePost(List<Post> list);

    int sendBackPost(List<Post> list);
}
