package com.znsd.thread.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.Test;

import com.znsd.thread.pojo.MyThread;

public class MyThreadTest {

	@Test
	public void test() {
		//单个线程的线程池，即每次只有一个线程执行任务
		//ExecutorService pool = Executors.newSingleThreadExecutor();
		//固定数量的线程池，每次
		ExecutorService pool = Executors.newFixedThreadPool(2);
		
		MyThread t1 = new MyThread();
		Thread ts = new Thread(t1);
		MyThread t2 = new MyThread();
		Thread ts2 = new Thread(t2);
		MyThread t3 = new MyThread();
		Thread ts3 = new Thread(t3);
		MyThread t4 = new MyThread();
		Thread ts4 = new Thread(t4);
		MyThread t5 = new MyThread();
		Thread ts5 = new Thread(t5);
		
		pool.execute(ts);
		pool.execute(ts2);
		pool.execute(ts3);
		pool.execute(ts4);
		pool.execute(ts5);
		pool.shutdown();
	}
	
	@Test
	public void sss() {
		int[] arr = {45,36,84,91,21,-1,6};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		List li = new ArrayList(10);
		li.add(1);
		System.out.println(li.size());
		int i = 10,j = 10;
		System.out.println(i+j);
		System.out.println(i-j);
		System.out.println(i*j);
		System.out.println(i/j);
		int k = 0;
		System.out.println(++k +"-"+ k++ +"-"+ ++k +"-"+ k);
	}
	int i=0;
	int j=10;
	@Test
	public void ss() {
		i++;
		System.out.print(i+"*");
		if(i<10) {
			ss();
		}
	}
}
