package com.AtmApp.atmoperations;

import java.util.Scanner;



public class Main {
	Scanner sc = new Scanner(System.in);
	Admin ad = new Admin();
	User us = new User();

	public void adminMenu() throws InvalidPINException, InvalidAccountNumberException, InavalidAccountException {
		System.out.println(Consolecolors.YELLOW+"Enter admin pin(password):"+Consolecolors.RESET);
		String pin = sc.next();
		boolean flag = ad.login(pin);
		if (flag) {
			System.out.println(Consolecolors.GREEN+"Login successfully\n" + "Welcome back BOSS"+Consolecolors.RESET);
			System.out.println("");
			int count = 0;
			while (count != 4) {
				System.out.println(Consolecolors.BLUE+"Yours Menu:\n1.AddnewAccount\n2.ViewAccountDetails\n3.DeleteAccount\n4.logout"+Consolecolors.RESET);
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					ad.addNewAccount();
					break;
				case 2:
					ad.viewAccountDetails();
					break;
				case 3:
						ad.deleteAccount();
					
					break;
				case 4:
					ad.logout();
					count=4;
					break;
				}

			}
		} else {
			System.out.println(Consolecolors.RED+"Inavlid Pin TryAgain"+Consolecolors.RESET);
		}
	}

	
	
	public void userMenu() throws InvalidAmountException, InSufficientBalanceException {
		System.out.println(Consolecolors.YELLOW+"enter the account num:"+Consolecolors.RESET);
		String accountnumber = sc.next();
		System.out.println(Consolecolors.YELLOW+"enter the pin:"+Consolecolors.RESET);
		String pin = sc.next();
		int crt;
		
			crt = User.userlogin(accountnumber, pin);
		
		System.out.println(crt);
		if(crt!=-1) {
			System.out.println(Consolecolors.GREEN+"User login Successfuly Welcome Back"+Consolecolors.RESET);
			System.out.println();
			int choice1=1;
			while(choice1!=4) {
				System.out.println(Consolecolors.BLUE+"1.Withdraw\n2.Depoist\n.3.CheckBalance\n4.logout"+Consolecolors.RESET);
				choice1=sc.nextInt();
				
			switch(choice1) {
				case 1:
					System.out.println(Consolecolors.YELLOW+"enter the amount to withdraw:"+Consolecolors.RESET);
					double amount=sc.nextDouble();
					us.Withdraw(amount,crt);
					break;
				case 2:
					System.out.println(Consolecolors.YELLOW+"enter the amoount to depoist : "+Consolecolors.RESET);
					double amount1=sc.nextDouble();
					us.Depoist(amount1, crt);
					break;
				case 3:
					
					us.checkBalance(crt);
					break;
				case 4:
					System.out.println(Consolecolors.GREEN+"user account logout successfully"+Consolecolors.RESET);
					us.logOut();
					choice1=4;
			}}}
			
		}
		
		
	



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main m = new Main();
		
		int input = 0;
		while (input != 3) {
			System.out.println(Consolecolors.BLUE+"Welcome to Bank :\n1.Admin\n2.User"+Consolecolors.RESET);
			int mode = sc.nextInt();
			try {
				switch (mode) {
				case 1:
					m.adminMenu();
					break;
				case 2:

					m.userMenu();
					break;
				case 3:
					System.out.println(Consolecolors.RED+"Do you want to exit the BAnk servies ex:click on the 3"+Consolecolors.RESET);
					System.out.println(Consolecolors.GREEN+"Thank you "+Consolecolors.RESET);
					input=3;
					break;
					

				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
