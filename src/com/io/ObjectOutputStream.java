package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;

public class ObjectOutputStream {

	public ObjectOutputStream(FileOutputStream fileOutputStream) {
		// TODO 自动生成的构造函数存根
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO 自动生成的方法存根
			ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("d:\\obj.txt"));
			Person_test p1=new Person_test("mike",40);
			((ObjectOutput) out).writeObject(p1);
			
			ObjectInputStream in=new ObjectInputStream(new FileInputStream("d:\\obj.txt"));
			Person_test person_test=(Person_test) in.readObject();
			System.out.println("name="+person_test.getName());
			System.out.println("age="+person_test.getAge());
	}

}
