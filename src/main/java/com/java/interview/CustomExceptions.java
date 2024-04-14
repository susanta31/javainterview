package com.java.interview;

import java.util.Scanner;

public class CustomExceptions {

	//7. Write a Java program to create and throw custom exceptions.
	public static void main(String args[]) throws MyException {

	        // Throwing the custom exception be passing the message
			throw new MyException(" This is my custom Exception ");
			
	  }
	
}

//Creating Custom Exception Class
class MyException extends Exception{
  //Defining Constructor to throw exception message
  public MyException(String message){
      super(message);
  }
}
