package com.AtmApp.atmoperations;

public class InvalidAccountNumberException extends Exception{
	InvalidAccountNumberException(String message) {
		super(message);
	}

}
