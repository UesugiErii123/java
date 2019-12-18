package com.xiancheng;

public class Thread7_test {

	public static void main(String[] args) {
		
		Thread t1=new Thread(()->{
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName()+"正在输出i:"+i);
			}
		},"优先级较低的线程"); 
		
		Thread t2=new Thread(()->{
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName()+"正在输出i:"+i);
			}
		},"优先级较高的线程"); 
		//使用匿名内部类
		Thread t3=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO 自动生成的方法存根
				for (int i = 0; i <10; i++) {
					System.out.println(Thread.currentThread().getName()+"正在输出s:"+i);
					
				}
			}
		},"优先级普通的线程");
		t1.setPriority(1);
		t2.setPriority(10);
		t3.setPriority(10);
		t1.start();
		t2.start();
		t3.start();
	}

}
