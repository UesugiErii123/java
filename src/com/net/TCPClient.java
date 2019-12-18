package com.net;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {

	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		Socket khdtjz=new Socket("10.2.103.22",8899);
		OutputStream os=khdtjz.getOutputStream();
		FileInputStream fin=new FileInputStream("d:\\1..jpg");
		byte[]zjhc=new byte[1024];
		int b=fin.read(zjhc);
		while (b!=-1) {
			os.write(zjhc,0,b);
			b=fin.read(zjhc);
		}
		khdtjz.shutdownOutput();
		InputStream is=khdtjz.getInputStream();
		b=is.read(zjhc);
		while (b!=-1) {
			System.out.println(new String(zjhc,0,b));
			b=is.read(zjhc);
		}
		is.close();
		khdtjz.close();
	}

}
