package com.biz.oracle02.dao;

import java.util.List;

import org.apache.ibatis.annotations.*;

import com.biz.oracle02.sql.ScoreSQL;
import com.biz.oracle02.vo.ScoreVO;

public interface ScoreDao {
	
	@Select(ScoreSQL.SC_ALL)
	public List<ScoreVO> sellectAll();
	
	@Select(ScoreSQL.SC_FIND_NUM)
	public List<ScoreVO> findByNum(String st_num);
	@Select(ScoreSQL.SC_FIND_ID)
	public ScoreVO findById(long id);
	
	@Insert(ScoreSQL.SC_INSERT)
	public int insert(ScoreVO vo);
	@Update(ScoreSQL.SC_UPDATE)
	public int update(ScoreVO vo);
	@Delete(ScoreSQL.SC_DELETE)
	public int delete(String st_num);
}
