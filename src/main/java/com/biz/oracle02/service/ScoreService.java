package com.biz.oracle02.service;

import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.biz.oracle02.dao.ScoreDao;
import com.biz.oracle02.db.OracleSQLFactory;
import com.biz.oracle02.vo.ScoreVO;

public class ScoreService {

	SqlSessionFactory sessionFactory;
	Scanner scan;
	
	public ScoreService() {
		// TODO Auto-generated constructor stub
		scan = new Scanner(System.in);
		
		OracleSQLFactory sqlFactory = new OracleSQLFactory();
		this.sessionFactory = sqlFactory.getSessionFactory();
	}
	
	
	public List<ScoreVO> viewScore(String st_num) {
		SqlSession session = sessionFactory.openSession();
		ScoreDao dao = session.getMapper(ScoreDao.class);
		
		List<ScoreVO> scList = dao.findByNum(st_num);
		
		for(ScoreVO vo : scList) {
			System.out.println(vo);
		}
		
		return scList;
	}
}
