package com.biz.oracle02.dao;

import java.util.List;

import org.apache.ibatis.annotations.*;

import com.biz.oracle02.vo.StdVO;

public interface StdDao {

	@Select(" SELECT * FROM tbl_student ")
	public List<StdVO> selectAll();
	
	public StdVO findById(String st_num);
	public List<StdVO> findByName(String st_Name);
	
	public int insert(StdVO vo);
	public int update(StdVO vo);
	public int delete(String st_num);
}
