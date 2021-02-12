package com.iu.s1.client;

public class ClientMain {

	public static void main(String[] args) {
		Client client = new Client();
		
		try {
			client.start();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
