package com.zeropol2.springlog2;

public class PrettyLog implements Log {


	public void write(String data) {
		// TODO Auto-generated method stub
		System.out.println("*************");
		System.out.println("data : "+data);
		System.out.println("*************");
	}

}
