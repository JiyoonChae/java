package com.iu.j2.serverTest;

public class ClientMain {
	public static void main(String[] args) {
		Client c = new Client();
		try {
			c.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
