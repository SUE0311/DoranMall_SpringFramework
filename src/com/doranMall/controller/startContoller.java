/*
 * 작성자 : 이지수
 * 작성일 : 2013.09.11
*/

package com.doranMall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class startContoller {

	/* 클라이언트용 메인 페이지 */
	@RequestMapping(value="/main",method=RequestMethod.GET)
	public String clientMain(){
		return "client/index";
	}
	
	/* 관리자용 메인 페이지 */
	@RequestMapping(value="/adminMain",method=RequestMethod.GET)
	public String adminMain(){
		return "admin/adminIndex";
	}
	
}
