package com.bai.eduservice.controller;


import com.bai.commonutils.result.R;
import com.bai.eduservice.entity.subject.OneSubject;
import com.bai.eduservice.service.EduSubjectService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@Api(description="课程管理")
@RestController
@RequestMapping("/eduservice/edu-subject")
//@CrossOrigin
public class EduSubjectController {

    @Autowired
    private EduSubjectService eduSubjectService;

    //添加课程分类
    //获取上传过来文件，把文件内容读取出来
    @ApiOperation(value = "读取excel内容")
    @PostMapping("addSubject")
    public R addSubject(MultipartFile file) {
        //上传过来excel文件
        eduSubjectService.saveSubject(file,eduSubjectService);
        return R.success();
    }

    //课程分类列表功能  树形结构显示
    @ApiOperation(value = "课程分类列表")
    @GetMapping("getAllSubject")
    public R getAllSubject(){
        //list集合泛型是一级分类  一级分类下包含二级分类
        List<OneSubject> list = eduSubjectService.getAllOneTwoSubject();
        return R.success().data("list",list);
    }
}

