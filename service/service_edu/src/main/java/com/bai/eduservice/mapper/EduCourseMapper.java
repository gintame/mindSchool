package com.bai.eduservice.mapper;

import com.bai.eduservice.entity.EduCourse;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bai.eduservice.entity.frontvo.CourseWebVo;
import com.bai.eduservice.entity.vo.CoursePublishVo;

/**
 * 课程 Mapper 接口
 */
public interface EduCourseMapper extends BaseMapper<EduCourse> {

    CoursePublishVo getPublishCourseInfo(String courseId);

    //根据课程id，查询课程信息
    CourseWebVo getBaseCourseInfo(String courseId);
}
