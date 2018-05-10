package com.znsd.thread.pojo;

public class MyThread implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "执行中...");
	}

}
