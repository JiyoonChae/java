package com.iu.s1.server;

import java.io.IOException;

public class ServerMain {

	public static void main(String[] args) {
		Server server = new Server();
		
		try {
			server.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
