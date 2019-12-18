package com.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.rmi.dgc.Lease;

public class RandomAccessFile_test {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自动生成的方法存根
		RandomAccessFile  raf=new RandomAccessFile("time.txt","rw");
		int time=Integer.parseInt(raf.readLine())-1;
		if (time>0) {
			System.out.println("您还可以尝试"+time+"次");
			
			raf.seek(0);
			raf.write((time+"").getBytes());
		}
		else {
			System.out.println("次数已经用完");
		}
		raf.close();
	}

}
