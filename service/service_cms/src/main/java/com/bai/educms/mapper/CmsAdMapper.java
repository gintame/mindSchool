package com.bai.educms.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bai.educms.entity.CmsAd;
import com.bai.educms.entity.vo.AdVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 首页banner表 Mapper 接口
 * </p>
 */
public interface CmsAdMapper extends BaseMapper<CmsAd> {

    List<AdVo> selectPageByQueryWrapper(
            Page<AdVo> pageParam,
            @Param(Constants.WRAPPER) QueryWrapper<AdVo> queryWrapper);
}
