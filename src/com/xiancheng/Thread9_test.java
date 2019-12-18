package com.xiancheng;

//线程安全

class TickWindow3 implements Runnable {
	private int tickets = 100;
	Object lock = new Object();
	public void run() {
		while (true) {
			synchronized (lock) {
				if (tickets > 0) {
					try {
						Thread.sleep(100);
					}catch (InterruptedException e) {
						e.printStackTrace();
					}
				}	
			}
				if (tickets>0) {
					System.out.println(Thread.currentThread().getName() + "正在发售" + tickets-- + "张票");
				} else {
					break;
				}
			}
		}
	}


public class Thread9_test {

	public static void main(String[] args) {
		TickWindow3 tw = new TickWindow3();
		new Thread(tw, "窗口1").start();
		new Thread(tw, "窗口2").start();
		new Thread(tw, "窗口3").start();
		new Thread(tw, "窗口4").start();
	}

}
