import java.io.*;
import java.util.*;

class customexception extends Exception{

	public customexception(String s){
		super(s);
	}
}

public class userexcep{	

	static void validate_age (int age) throws customexception{

		if(age < 18){
			throw new customexception("Candidate is not qualified :(");
		}

		else{
			System.out.println("Candidate is qualified :)");
		}
	}


public static void main(String args[]){

	Scanner read = new Scanner(System.in);

	int age;

	age = read.nextInt();

	try{
		validate_age(age);
	}
	catch (customexception ex){
		System.out.println("Caught the exception");

		System.out.println("Exception Occured with message: "+ex);
	}
}
}