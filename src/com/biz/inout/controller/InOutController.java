package com.biz.inout.controller;

import java.io.IOException;

import com.biz.inout.service.InOutService_01;

public class InOutController {

	public static void main(String[] args) {

		InOutService_01 ioList = new InOutService_01();
		
		try {
			ioList.Reader();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
