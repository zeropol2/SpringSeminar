package com.zeropol2.springlog2;


public class Client {
	private Log log;
	
	public void setLog(Log log) {
		this.log =  log;
	}
	
	public void biz() {
		
		log.write("test");
	}
}
