package com.runtime;

import java.util.Random;

public class Ssq {

	public static void main(String[] args) throws InterruptedException {
		Random a =new Random();
		System.out.println("你的号码是:");
		for (int i = 0; i < 6; i++) {
			int hq=a.nextInt(33)+1;
			System.out.print(hq+"  ");
			
		}
		System.out.println(a.nextInt(16)+1);
		
		System.out.println("双色球开奖了");
		Random r=new Random();
		System.out.println("六个红球的号码为:");
		Thread.sleep(1000);
		for (int i = 0; i < 6; i++) {
			int hq=r.nextInt(33)+1;
			System.out.print(hq+"  ");
			Thread.sleep(1000);
		}
		System.out.println();
		Random l=new Random();
		System.out.println("蓝球的号码为:");
		Thread.sleep(1000);
		
			System.out.println(r.nextInt(16)+1);
			Thread.sleep(1000);
			
		
	}

}
