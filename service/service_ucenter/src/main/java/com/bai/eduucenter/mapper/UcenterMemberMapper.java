package com.bai.eduucenter.mapper;

import com.bai.eduucenter.entity.UcenterMember;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * 会员表 Mapper 接口
 */
public interface UcenterMemberMapper extends BaseMapper<UcenterMember> {

    //查询某天注册人数
    Integer countRegister(String day);
}
