package com;

public interface Intr {

	public void sayHello();
}


class Main{
	
	public static void main(String[] args) {
		
		Intr it = new Intr()
		{
			@Override
			public void sayHello() {
				System.out.println("using anno");
			};
			
		};
		it.sayHello();
		
		Intr i = ()->System.out.println("teri barah");
		
		i.sayHello();
		
	}
			
	
}