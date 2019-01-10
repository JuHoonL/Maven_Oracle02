package com.biz.oracle02.dao;

import java.util.List;

import org.apache.ibatis.annotations.*;

import com.biz.oracle02.sql.StdSQL;
import com.biz.oracle02.vo.StdVO;

public interface StdDao {

	//Annotation을 사용!!
	@Select(StdSQL.STD_ALL)
	public List<StdVO> selectAll();
	
	@Select(StdSQL.STD_FIND_NUM)
	public StdVO findById(String st_num);
	@Select(StdSQL.STD_FIND_NAME)
	public List<StdVO> findByName(String st_Name);
	
	@Insert(StdSQL.STD_INSERT)
	public int insert(StdVO vo);
	@Update(StdSQL.STD_UPDATE)
	public int update(StdVO vo);
	@Delete(StdSQL.STD_DELETE)
	public int delete(String st_num);
}
