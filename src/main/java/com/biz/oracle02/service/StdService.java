package com.biz.oracle02.service;

import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.biz.oracle02.dao.StdDao;
import com.biz.oracle02.db.OracleSQLFactory;
import com.biz.oracle02.vo.StdVO;

public class StdService {

	SqlSessionFactory sessionFactory;
	
	Scanner scan ;
	
	public StdService() {
		
		scan = new Scanner(System.in);
		
		OracleSQLFactory sqlFactory = new OracleSQLFactory();
		this.sessionFactory = sqlFactory.getSessionFactory();
	}

	
	public void stdView() {
		// TODO Auto-generated method stub
		SqlSession session = this.sessionFactory.openSession();
		StdDao dao = session.getMapper(StdDao.class);
		
		List<StdVO> stdList = dao.selectAll();
		
		for(StdVO vo : stdList) {
			System.out.println(vo);
		}
	}
	
	
	public void insert() {
				
		StdVO vo = this.stdInfoInput();
		
		if(vo == null) return;
		
		SqlSession session = this.sessionFactory.openSession();
		StdDao dao = session.getMapper(StdDao.class);
		
		int ret = dao.insert(vo);
		
		session.commit();
		session.close();
		
		if(ret > 0) {
			System.out.println("추가 성공!!");
		} else {
			System.out.println("추가 실패!!");
		}
		
	}
	
	
	public void update() {
		
		StdVO vo = this.stdInfoInput();
		
		if(vo == null) return;
		
		//추가사항 총리스트를 보여주고 변경할 곳을 지정해주고 변경하는 부분 추가해야됌!!
		
		SqlSession session = this.sessionFactory.openSession();
		StdDao dao = session.getMapper(StdDao.class);

		int ret = dao.update(vo);
		
		session.commit();
		session.close();
		
		if(ret > 0) {
			System.out.println("변경 성공!!");
		} else {
			System.out.println("변경 실패!!");
		}
		
	}
	
	
	private StdVO stdInfoInput() {
		System.out.println("===========================================================================");
		System.out.println("학생 정보 입력");
		System.out.println("---------------------------------------------------------------------------");
		System.out.print("학번(종료:0) >> ");
		String strNum = scan.nextLine();
		if(strNum.equals("0")) return null;
		
		System.out.print("이름 >> ");
		String strName = scan.nextLine();
		
		System.out.print("학년 >> ");
		String strGrade = scan.nextLine();
		
		System.out.print("전화번호 >> ");
		String strTel = scan.nextLine();
		
		StdVO vo = new StdVO(strNum,strName,strGrade,strTel);
		
		return vo;
	}
	
	
	
	
	
}
