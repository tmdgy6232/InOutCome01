package com.biz.inout.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.inout.model.InOutVO;

public class InOutService_01 {

	String Inoutfile = "src/com/biz/inout/매입매출.txt";
	FileReader fileReader;
	BufferedReader buffer;
	List<InOutVO> marketList = new ArrayList<InOutVO>();

	public void Reader() throws IOException {
		int inTotal = 0;
		int outTotal = 0;
		fileReader = new FileReader(Inoutfile);
		buffer = new BufferedReader(fileReader);

		String strR = "";
		System.out.println("==========================================================");
		System.out.println("거래일자\t상품명\t구분\t단가\t수량\t매입금액\t매출금액");
		System.out.println("----------------------------------------------------------");

		int inLen = marketList.size();
		
			while (true) {
				strR = buffer.readLine();
				if (strR == null)
					break;
				String[] strRs = strR.split(":");
				InOutVO vo = new InOutVO();

				vo.setDate(strRs[0]);
				vo.setName(strRs[1]);
				vo.setInOut(strRs[2]);
				vo.setPrice(strRs[3]);
				if (strRs[2].equals("1")) {
					vo.setInOut("매입");
					int intprice = Integer.valueOf(strRs[3]);
					int intvolume = Integer.valueOf(strRs[4]);
					inTotal = intprice * intvolume;

					vo.setInTotal(inTotal);
				}
				if (strRs[2].equals("2")) {
					vo.setInOut("매출");
					int outprice = Integer.valueOf(strRs[3]);
					int outvolume = Integer.valueOf(strRs[4]);
					outTotal = outprice * outvolume;

					vo.setOutTotal(outTotal);
				}
				vo.setVolume(strRs[4]);
				marketList.add(vo);

			}
		
		int intLen = marketList.size();

		for (InOutVO vo : marketList) {
			System.out.println(vo);
			vo.setInTotal(0);
			vo.setOutTotal(0);
		}
	}
}
