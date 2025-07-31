package com.masai;

public class Account {

	static String bankName;
	
	long accountNumber;
	String accountHolderName;
	double balance;
	
	 
	
	public static void main(String[] args) {
		
		
		Account.bankName ="BOI";
		
		Account ac1 = new Account();
		ac1.accountNumber=25422323432L;
		ac1.accountHolderName= "ramesh";
		ac1.balance=2323;
		
		
		Account ac2=new Account();
		ac2.accountHolderName="Amit";
		ac2.accountNumber=25422323432L;
		ac2.balance=6000;
		
		System.out.println("Account 1 details");
		System.out.println(ac1.bankName);
		System.out.println(ac1.accountHolderName);
		System.out.println(ac1.balance);
		
		System.out.println("======================");
		
		System.out.println("Account 2 details");
		System.out.println(ac2.bankName);
		System.out.println(ac2.accountHolderName);
		System.out.println(ac2.balance);	
	}
	
}
