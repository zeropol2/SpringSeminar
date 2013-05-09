package com.zeropol2.springlog2;


public class Main {
	public static void main(String[] args) {
		Log log = new PrettyLog();
		
		Client testClient = new Client();
		
		testClient.setLog(log);
		testClient.biz();
	}

}
