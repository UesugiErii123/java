package com.xiancheng;

class DaemonThread implements Runnable {

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		while (true) {
			System.out.println(Thread.currentThread().getName() + "---正在运行");
		}
	}

}

public class Thread6_test {

	public static void main(String[] args) {
		if (!Thread.currentThread().isDaemon()) {
			System.out.println("main方法线程也就是主线程不是后台线程");
		}
		Thread t = new Thread(new DaemonThread(), "后台线程");
		if (!t.isDaemon()) {
			System.out.println("t线程不是后台线程");
		}
		// 将新建立的线程设置为后台线程
		t.setDaemon(true);
		t.start();
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
	}

}
