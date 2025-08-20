package com.AtmApp.atmoperations;

import java.util.Scanner;

public class User {
	Scanner sc = new Scanner(System.in);

	
	public static int userlogin(String accountnumber, String pin) {
		boolean flag = true;
		for (int i = 0; i < Admin.account; i++) {

			if (accountnumber.equals(Admin.array[i].getAccountNumber()) && pin.equals(Admin.array[i].getPin())) {
				Admin.array[i].toString();
				return i;
			}

		}
		if (!flag) {
			System.out.println("Enter valid PIN in the Combination Alphabets and Numbers ex:naga@123");
		}

		return -1;
	}

	
	public void Withdraw(double amount, int i) throws InSufficientBalanceException {
		// Admin.array[i].Withdraw(amount);
		if (amount > 0 && amount < Admin.array[i].getBalance()) {
			double balance = Admin.array[i].getBalance() - amount;

			Admin.array[i].setBalance(balance);
			System.out.println(Consolecolors.GREEN + "Amount withdrawed Succsefully and current balance : " + balance
					+ Consolecolors.RESET);

		} else {
			throw new InSufficientBalanceException("Insufficient balance in your Account");
		}
	}

	
	public void Depoist(double amount, int i) throws InvalidAmountException {
		if (amount > 100) {
			double balance = Admin.array[i].getBalance() + amount;
			Admin.array[i].setBalance(balance);
			System.out.println(
					Consolecolors.YELLOW + "The updated balance in your account:" + balance + Consolecolors.RESET);
		} else {
			throw new InvalidAmountException("insuffficient amount to deposi ex:100 or more than 100");

		}

	}

	
	public void checkBalance(int i) {
		double balance = Admin.array[i].getBalance();
		System.out.println(Consolecolors.YELLOW + "your current balance is :" + balance + Consolecolors.RESET);
	}

	
	public void logOut() {
		System.out.println(Consolecolors.GREEN + "you have been logout Succesfully" + Consolecolors.RESET);
		System.out.println();

	}
}
