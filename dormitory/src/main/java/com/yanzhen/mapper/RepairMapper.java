package com.yanzhen.mapper;

import java.util.List;

import com.yanzhen.entity.Repair;

public interface RepairMapper {

	public int create(Repair repair);

	public int delete(Integer id);

	public int update(Repair repair);

	public int updateSelective(Repair repair);

	public List<Repair> query(Repair repair);

	public Repair detail(Integer id);

	public int count(Repair repair);

}