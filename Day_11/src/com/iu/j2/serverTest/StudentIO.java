package com.iu.j2.serverTest;

import java.net.Socket;

import com.iu.j1.message.MessageIO;

public class StudentIO {
	
	public void students(String list) {

	String [] ar = list.split(",");
	Student student = new Student();
	student.setName(ar[0].trim());
	student.setNum(Integer.parseInt(ar[1].trim()));
	student.setKor(Integer.parseInt(ar[2].trim()));
	student.setEng(Integer.parseInt(ar[3].trim()));
	student.setMath(Integer.parseInt(ar[4].trim()));
	student.setTotal(student.getKor()+student.getEng()+student.getMath());
	student.setAvg(student.getTotal()/3.0);

	
	}
}
	
	
