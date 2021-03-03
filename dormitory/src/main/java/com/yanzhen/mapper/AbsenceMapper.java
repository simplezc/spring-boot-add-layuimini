package com.yanzhen.mapper;

import java.util.List;

import com.yanzhen.entity.Absence;

public interface AbsenceMapper {

	public int create(Absence absence);

	public int delete(Integer id);

	public int update(Absence absence);

	public int updateSelective(Absence absence);

	public List<Absence> query(Absence absence);

	public Absence detail(Integer id);

	public int count(Absence absence);

}