package com.biz.oracle02.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * lombok 플러그인을 eclipse에 설치해서 VO클래스의 gettter, setter 생성자와 toString등의 작성을 대신 하도록 만들었다. 
 */

@Data
@AllArgsConstructor	// 멤버변수 생성자
@NoArgsConstructor // 기본 super생성자
public class ScoreVO {
	
	private int id ;
	private String st_num ;
	private String sc_sb_code;
	private int sc_score ;
	
}
