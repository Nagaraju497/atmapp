package com.AtmApp.atmoperations;

import java.util.Scanner;

public class Admin {
	static Account[] array = new Account[10];
	static int account = 0;

	private static final String ADMIN_PIN = "1234";
	Scanner sc = new Scanner(System.in);

	public boolean login(String enteredPin) {
		return ADMIN_PIN.equals(enteredPin);
	}

	
	
	//this add account
	public void addNewAccount() throws InvalidPINException, InvalidAccountNumberException {
		System.out.println(Consolecolors.YELLOW + "enter username :" + Consolecolors.RESET);
		String username = sc.next();
		System.out.println(Consolecolors.YELLOW + "enter the location:" + Consolecolors.RESET);
		String location = sc.next();
		System.out.println(Consolecolors.YELLOW + "enter account number:" + Consolecolors.RESET);
		String accountnumber = sc.next();

		System.out.println(Consolecolors.YELLOW + "enter the pin:" + Consolecolors.RESET);
		String pin = sc.next();
		System.out.println(Consolecolors.YELLOW + "enter the initial balance" + Consolecolors.YELLOW);
		double initialbalance = sc.nextInt();
		Account ac = new Account(username, location, accountnumber, pin, initialbalance);
		array[account++] = ac;
	}

	
	public void viewAccountDetails() {
		for (int i = 0; i < account; i++) {
			if (array[i] == null) {
				continue;

			}
			System.out.println(array[i].toString());
		}

	}

	
	public void deleteAccount() throws InavalidAccountException {
		System.out.println(Consolecolors.YELLOW + "enter the account number" + Consolecolors.RESET);
		String accountnumber = sc.next();
		boolean found = false;
		for (int i = 0; i < account; i++) {

			if (array[i] != null && accountnumber.equals(array[i].getAccountNumber())) {
				array[i] = null;
				found = true;
				System.out.println(Consolecolors.GREEN + "Account :" + accountnumber + "Deleted Successfully"
						+ Consolecolors.RESET);
				break;

			}
		}
		if (!found) {
			throw new InavalidAccountException("Account number not found  try agin");

		}
	}

	public void logout() {
		System.out.println(Consolecolors.GREEN + "you have been logedout succesfully " + Consolecolors.RESET);

		System.out.println();

	}

}
