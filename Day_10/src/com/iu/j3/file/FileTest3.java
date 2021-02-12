package com.iu.j3.file;

import java.io.File;

public class FileTest3 {
	public static void main(String[] args) {
		File file = new File("c:\\test");
		File [] ar = file.listFiles();		//파일객체를받아서 리턴??
		
		for(File f : ar) {
			if(f.isDirectory()) {
				System.out.println("DIR " + f.getName());
			}
			if(f.isFile()) {
				System.out.println("File " + f.getName());
			}
		}
	}
}
