/*
 * �ۼ��� : ������
 * �ۼ��� : 2013.09.11
*/

package com.doranMall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class startContoller {

	/* Ŭ���̾�Ʈ�� ���� ������ */
	@RequestMapping(value="/main",method=RequestMethod.GET)
	public String clientMain(){
		return "client/index";
	}
	
	/* �����ڿ� ���� ������ */
	@RequestMapping(value="/adminMain",method=RequestMethod.GET)
	public String adminMain(){
		return "admin/adminIndex";
	}
	
}
