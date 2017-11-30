package com.yyx.aio.controller;

import com.yyx.aio.common.entity.ErrorResponseEntity;
import com.yyx.aio.common.entity.ResponseEntity;
import com.yyx.aio.common.entity.SuccessResponseEntity;
import com.yyx.aio.common.pageInfo.PageInfo;
import com.yyx.aio.entity.Post;
import com.yyx.aio.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {

    @Autowired(required = false)
    private PostService postService;

    @GetMapping("getPostListByInfo")
    public ResponseEntity getPostListByInfo(Post post, PageInfo pageInfo){

        try {
            List<Post> list =postService.getPostListByInfo(post,pageInfo);
            return new SuccessResponseEntity(list);
        } catch (Exception e) {
            e.printStackTrace();
            return new ErrorResponseEntity("出现错误，请联系管理员");
        }

    }
    @GetMapping("deletePost")
    public ResponseEntity deletePost(List<Post> list){

        try {
            int deleteStatus =postService.deletePost(list);
            return new SuccessResponseEntity(deleteStatus);
        } catch (Exception e) {
            e.printStackTrace();
            return new ErrorResponseEntity("出现错误，请联系管理员");
        }
    }

    @GetMapping("sendBackPost")
    public ResponseEntity sendBackPost(List<Post> list){

        try {
            int sendBackStatus =postService.sendBackPost(list);
            return new SuccessResponseEntity(sendBackStatus);
        } catch (Exception e) {
            e.printStackTrace();
            return new ErrorResponseEntity("出现错误，请联系管理员");
        }
    }
}
