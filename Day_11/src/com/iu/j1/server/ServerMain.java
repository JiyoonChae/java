package com.iu.j1.server;

public class ServerMain {
	public static void main(String[] args) {
		Server s = new Server();
		try {
			s.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
