package com.yanzhen.mapper;

import java.util.List;

import com.yanzhen.entity.Notice;

public interface NoticeMapper {

	public int create(Notice notice);

	public int delete(Integer id);

	public int update(Notice notice);

	public int updateSelective(Notice notice);

	public List<Notice> query(Notice notice);

	public List<Notice> queryByBuildingId(Notice notice);

	public Notice detail(Integer id);

	public int count(Notice notice);

}