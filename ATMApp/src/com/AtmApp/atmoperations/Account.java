package com.AtmApp.atmoperations;

import java.util.Scanner;



public class Account {
	private String username;
	private String location;
	private String accountNumber;
	private String pin;
	private double balance;

	Scanner sc = new Scanner(System.in);


	Account(String username, String location, String accountNumber, String pin, double balance) throws InvalidPINException, InvalidAccountNumberException {
		this.username = username;
		this.location = location;
	    setAccountNumber(accountNumber);
		setPin(pin);
		this.balance = balance;
	}

	public String getUserName() {
		return username;

	}

	public String getLocation() {
		return location;
	}

	public String getAccountNumber() {

		return accountNumber;

	}

	public String getPin() {
		return pin;

	}

	public double getBalance() {
		return balance;
	}

	public void setAccountNumber(String accountNumber) throws InvalidAccountNumberException {
		
			if (accountNumber.contains("sbi")) {
				this.accountNumber = accountNumber;
				

			} else {
				throw new InvalidAccountNumberException("It must be contains 'sbi'  ex: sbi@123");
				//System.out.println("It must be contains 'sbi'  ex: sbi@123");
			}
			
			
	}

	public void setPin(String pin) throws InvalidPINException{
		
			char ch[] = pin.toCharArray();

			boolean l = false;
			boolean d = false;
			
			for (char ch1 : ch) {
				if (Character.isAlphabetic(ch1)) {
					l = true;
				} else if (Character.isDigit(ch1)) {
					d = true;
				}
			}
			
			if (l && d) {
				this.pin = pin;
				
			} else {
	
				throw new InvalidPINException("pin is invalid to set pin mandatory combination of digit,letter");
				
				
			}
		}
	
	
	
	public void setBalance(double amt) {
		this.balance=amt;
	}
	


	public String toString() {
		return "Account Details\n" + "username: " + username + "\nlocation :" + location + "\naccount number :"
				+ accountNumber + "\npin: " + pin + "\nbalance :" + balance;

	}

}
