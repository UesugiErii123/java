package com.xiancheng;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class LockThread implements Runnable{

		private int tickets=10;
		private final Lock lock=new ReentrantLock(); 
	@Override
	public void run() {
		while (true) {
			lock.lock();
			if (tickets>0){
				try {
					Thread.sleep(100);
					System.out.println(Thread.currentThread().getName() + "正在发售" + tickets-- + "张票");
				}catch (InterruptedException e) {
					e.printStackTrace();
				}finally {
					lock.unlock();
				}
			}
		}
	}
}
public class Thread11_test {

	public static void main(String[] args) {
		LockThread tw = new LockThread();
		new Thread(tw, "窗口1").start();
		new Thread(tw, "窗口2").start();
		new Thread(tw, "窗口3").start();
		new Thread(tw, "窗口4").start();

	}

}
