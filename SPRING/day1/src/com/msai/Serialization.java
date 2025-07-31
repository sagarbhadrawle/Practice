package com.msai;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Serialization {

	public static void main(String[] args) throws IOException {
		
		A a1 = new A();
		a1.i=1;
		
		A a2  = new A();
		a2.i=2;
		
		List<A> list = new ArrayList<>();
		
		list.add(a1);
		list.add(a2);
		
		
		FileOutputStream fos = new FileOutputStream("sagar.ser");
		ObjectOutputStream oos =new ObjectOutputStream(fos);
		
		oos.writeObject(list);
		System.out.println("serialized");
	}
}
