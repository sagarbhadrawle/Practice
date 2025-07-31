package com.msai;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FIleWriter {
	
	public static void main(String[] args) throws IOException {
//		FileWriter fw = new FileWriter("abc.txt",true);
//		
//		fw.write(100);
//		fw.write("ramesh\nwelcome");
//		char ch[] = { '+','b','c'};
//		fw.write(ch);
//		
//		fw.flush();
//		fw.close();
//		
//		System.out.println("done");
//		
//		FileReader fr = new FileReader("abc.txt");
//				
//		int i1 = fr.read();
//		int i2 = fr.read();
//		int i3 = fr.read();
//		int i4 = fr.read();
//		int i5 = fr.read();
//		int i6 = fr.read();
//		int i7 = fr.read();
//		System.out.println((char)i1+" "+i2+" "+i3);
//		
//		
//		File f = new File("abc.txt");
//		
//		System.out.println("hi"+f.length());
//		
//		char[] chr = new char[(int)f.length()];
//		System.out.println(chr);
//		System.out.println(fr.read(chr));
//		
//		for(char c : chr)
//		{
//			System.out.println(c);    
//		}
//		
		
		FileWriter ft = new FileWriter("ab.txt");
		
		BufferedWriter bw = new BufferedWriter(ft);
		
		
		 bw.write(100);
		 bw.newLine();
		 bw.write("akklesh");
		 bw.newLine();
		 bw.write("india");
		 
		 bw.flush();
		 bw.close();
		 System.out.println("done");
		
	
		 BufferedReader br = new BufferedReader(new FileReader("ab.txt"));
		 
		String line = br.readLine();
		
		while(line != null)
		{
			System.out.println(line);
			line = br.readLine();
			
		}
		br.close();
		 
		
		 
	}
}
