package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Palindrome {
	public static void main(String[] args) throws IOException 
	{
		
		System.out.print("Enter the String1: ");

		BufferedReader bfn1 = new BufferedReader(
	            new InputStreamReader(System.in));
		
	    String s1 = bfn1.readLine();
	    
	    StringBuilder sbs1 = new StringBuilder(s1);
	    sbs1.reverse();
	    if(s1.equals(sbs1.toString())) 
	    {
	    	System.out.println("Yes");
	    }
	    else
	    {
	    	System.out.println("No");
	    }
	}
}
