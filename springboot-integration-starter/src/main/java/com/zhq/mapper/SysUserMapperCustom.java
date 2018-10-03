package com.zhq.mapper;

import java.util.List;

import com.zhq.pojo.SysUser;

public interface SysUserMapperCustom {
	
	List<SysUser> queryUserSimplyInfoById(String id);
}