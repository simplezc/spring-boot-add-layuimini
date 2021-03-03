package com.yanzhen.mapper;

import java.util.List;

import com.yanzhen.entity.Selection;

public interface SelectionMapper {

	public int create(Selection selection);

	public int delete(Integer id);

	public int update(Selection selection);

	public int updateSelective(Selection selection);

	public List<Selection> query(Selection selection);

	public List<Selection> queryByClazzId(Integer clazzId);

	public Selection detail(Integer id);

	public int count(Selection selection);

}