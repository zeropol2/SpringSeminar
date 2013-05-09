package com.zeropol2.springlog2;

public class DefaultLog implements Log {
	public void write(String data) {
		System.out.println("data : "+data);
	}
}
