package com.te.demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeObject {
	public static void main(String[] args) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream("D:\\text.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		Student student = new Student();
		student.sId = 100;
		student.sName = "Nilim";
		objectOutputStream.writeObject(student);
	}
}
