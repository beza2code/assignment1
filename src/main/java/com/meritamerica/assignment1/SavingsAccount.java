package com.meritamerica.assignment1;

public class SavingsAccount {
	 private double balance;
	    private final double INTEREST_RATE = 0.01;

	    public SavingsAccount(double openingBalance) {
	        //super();
	        balance = openingBalance;
	    }
    
	    public double getBalance() {
	        return balance;
	    }
    
	    public double getInterestRate() {
	        return INTEREST_RATE;
	    }
    
	    boolean withdraw(double amount) {
	        if (amount < 0.0 ||amount > balance)  {
	            return false;
	        }
	        else { 
	        	balance = balance - amount;
	        }
	        return true;
	    }

	    boolean deposit(double amount) {
	        if (amount < 0.0) {
	            return false;
	            
	        }else {
	        	balance = balance + amount;
	        }
	        return true;
	    }

	    double futureValue(int months) {
	        return balance * Math.pow(1 + INTEREST_RATE, months); 
	    }

	  

		@Override
	    public String toString() {
	        return "\nSavings Account Balance: $" + String.format("%.2f", this.getBalance())
	        + "\nSavings Account Interest Rate: " + String.format("%.4f", this.getInterestRate())
	        + "\nSavings Account Balance in 3 years: " + String.format("%.2f", this.futureValue(3));
	    }
	}