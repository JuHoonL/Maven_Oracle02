package com.biz.oracle02.exec;

import java.util.List;
import java.util.Scanner;

import com.biz.oracle02.service.ScoreService;
import com.biz.oracle02.vo.ScoreVO;

public class OrExec02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ScoreService ss = new ScoreService();
		
		
		ss.viewScore("00001");
		
	}

}
