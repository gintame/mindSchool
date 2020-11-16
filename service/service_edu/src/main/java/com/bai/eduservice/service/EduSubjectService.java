package com.bai.eduservice.service;

import com.bai.eduservice.entity.EduSubject;
import com.baomidou.mybatisplus.extension.service.IService;
import com.bai.eduservice.entity.subject.OneSubject;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * 课程科目 服务类
 */
public interface EduSubjectService extends IService<EduSubject> {

    //添加课程分类
    void saveSubject(MultipartFile file, EduSubjectService eduSubjectService);

    //课程分类列表功能
    List<OneSubject> getAllOneTwoSubject();
}
