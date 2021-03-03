package com.yanzhen.entity;

import org.hibernate.validator.constraints.Length;
import com.yanzhen.utils.Entity;


/**
 * 
 * @author 596183363@qq.com
 * @time 2020-11-21 14:27:15
 */
public class DormitorySet extends Entity{

	/**
	 * 
	 */
	private Integer id;
	/**
	 * 
	 */
	@Length(max = 50)
	private String prefix;
	/**
	 * 
	 */
	private Integer start;
	/**
	 * 
	 */
	private Integer end;
	/**
	 * 
	 */
	private Integer buildingId;
	/**
	 * 
	 */
	private Integer storeyId;
	/**
	 * 
	 */
	private Integer capacity;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPrefix() {
		return prefix;
	}
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public Integer getStart() {
		return start;
	}
	public void setStart(Integer start) {
		this.start = start;
	}
	public Integer getEnd() {
		return end;
	}
	public void setEnd(Integer end) {
		this.end = end;
	}
	public Integer getBuildingId() {
		return buildingId;
	}
	public void setBuildingId(Integer buildingId) {
		this.buildingId = buildingId;
	}
	public Integer getStoreyId() {
		return storeyId;
	}
	public void setStoreyId(Integer storeyId) {
		this.storeyId = storeyId;
	}
	public Integer getCapacity() {
		return capacity;
	}
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "DormitorySet{" +
				"id=" + id +
				", prefix='" + prefix + '\'' +
				", start=" + start +
				", end=" + end +
				", buildingId=" + buildingId +
				", storeyId=" + storeyId +
				", capacity=" + capacity +
				'}';
	}
}