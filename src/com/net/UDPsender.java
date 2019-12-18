package com.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

@SuppressWarnings("unused")
public class UDPsender {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		DatagramSocket client = new DatagramSocket(3000);
		String str = "来自热心市民张浩的问候";
		byte[] zjsz=str.getBytes("UTF-8");
		DatagramPacket packet = new DatagramPacket(zjsz,zjsz.length,InetAddress.getByName("10.2.103.31"), 8900);
		System.out.println("开始发送信息...");
		client.send(packet);
		client.close();
	}

}
