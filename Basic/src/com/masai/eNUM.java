package com.masai;


enum Season {
	
	winter(10){
		public void fun()
		{
			System.out.println("hi");
		}
		
		
	},summer(10);
	
	private int value;
	private Season(int value)
	{
		this.value = value;
	}
}

public class eNUM {
	
	public static void main(String[] args) {
		
		Season[] values = Season.values();
		for(Season t : values) {
			System.out.println(t);
		}
		
	}
}
