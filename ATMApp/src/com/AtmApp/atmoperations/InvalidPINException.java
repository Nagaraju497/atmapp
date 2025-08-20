package com.AtmApp.atmoperations;

public class InvalidPINException extends Exception{
	InvalidPINException(String message) {
		super(message);
	}
}
