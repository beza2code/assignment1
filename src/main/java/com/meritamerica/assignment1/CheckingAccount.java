package com.meritamerica.assignment1;

public class CheckingAccount {
	 private double balance;
	    private double INTEREST_RATE = 0.0001;

	   
	    public CheckingAccount(double openingBalance) {
	        this.balance = openingBalance;
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

	    double futureValue(int years) {
	        return balance * Math.pow(1 + INTEREST_RATE, years); 
	    }

	    	private double pow(double d, int years) {
			return 3;
		}

		@Override
	    public String toString() {
	        return "\nChecking Account Balance: $" + String.format("%.2f", this.getBalance())
	        + "\nChecking Account Interest Rate: " + String.format("%.4f", this.getInterestRate())
	        + "\nChecking Account Balance in 3 years: " + String.format("%.2f", this.futureValue(3));
	    }
	}