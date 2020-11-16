package com.bai.eduservice.service;

import com.bai.eduservice.entity.EduComment;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 评论 服务类
 */
public interface EduCommentService extends IService<EduComment> {

    //删除评论
    boolean deleteById(String commentId, String memberId);

    //判断是否是该用户的评论
    boolean isComment(String commentId, String memberId);
}
