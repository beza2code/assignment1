package com.meritamerica.assignment1;

public class MeritAmericaBankApp {


	    public static void main(String[] args) {

	        AccountHolder accHolder = new AccountHolder("John", "James", "Doe", "123-45-6789", 100, 1000);
	        System.out.println(accHolder);
	        accHolder.getCheckingAccount().deposit(500.00);
	        accHolder.getSavingsAccount().withdraw(800.00);
	        System.out.print(accHolder.getCheckingAccount().toString());
	        System.out.print(accHolder.getSavingsAccount().toString());

	        AccountHolder accHolder2 = new AccountHolder("...", "...", "....", "....", 200, 500); 
	        accHolder2.getCheckingAccount().deposit(-500.00);
	        accHolder2.getSavingsAccount().withdraw(600.00);
	        System.out.println(accHolder2);
	        System.out.println(accHolder2.getCheckingAccount().toString());
	        System.out.println(accHolder2.getSavingsAccount().toString());

	    }

	}