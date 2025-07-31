package com.msai;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Deserialization {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream  ois  = new ObjectInputStream(new FileInputStream("sagar.ser"));
		
		List<A> list= (List<A>) ois.readObject();
		
		for(A t : list)
		{
			System.out.println(t.i);
		}
		
		
		
		System.out.println(list);
	}
	
}
