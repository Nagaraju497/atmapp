package com.AtmApp.atmoperations;

public class InSufficientBalanceException extends Exception {
	InSufficientBalanceException(String message){
		super(message);
	}
}
