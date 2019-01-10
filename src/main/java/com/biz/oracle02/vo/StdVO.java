package com.biz.oracle02.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//원하는 항목만 만들려면 ..
@Data 	// 전체
//@Getter // getter만
//@Setter // setter만
//@ToString	// toString
//@Builder	// 생성자만(멤버변수 초기화 생성자), 기본생성자는 감춰버림
@AllArgsConstructor	// 멤버변수 생성자
@NoArgsConstructor // 기본 super생성자
public class StdVO {

	private String st_num ;
	private String st_name ;
	private String st_grade ;
	private String st_tel ;

}
