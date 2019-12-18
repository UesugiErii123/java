package com.io;

import java.io.*;
import java.nio.channels.*;

import javax.xml.transform.Source;
public class Wenjiankaobei {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		RandomAccessFile infile=new RandomAccessFile("d:\\360Downloads.rar","rw");
		
		FileChannel inChannel = infile.getChannel();
		RandomAccessFile outfile=new RandomAccessFile("d:\\360Downloads.rar2","rw");
		
		FileChannel outChannel = outfile.getChannel();
		long tranferTo=inChannel.transferTo(0,inChannel.size(),outChannel);
		if (tranferTo>0) {
			System.out.println("复制成功!");
		}
		infile.close();
		inChannel.close();
		outfile.close();
		outChannel.close();
	}

}
