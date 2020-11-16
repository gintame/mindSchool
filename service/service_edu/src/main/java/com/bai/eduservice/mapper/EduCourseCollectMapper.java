package com.bai.eduservice.mapper;

import com.bai.eduservice.entity.EduCourseCollect;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bai.eduservice.entity.vo.CourseCollectVo;

import java.util.List;

/**
 * <p>
 * 课程收藏 Mapper 接口
 * </p>
 */
public interface EduCourseCollectMapper extends BaseMapper<EduCourseCollect> {

    //获取课程收藏列表
    List<CourseCollectVo> selectPageByMemberId(String memberId);
}
