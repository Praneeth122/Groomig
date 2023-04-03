package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringReverse {
	public static void main(String[] args) throws IOException 
	{
		
		System.out.print("Enter the String: ");

		BufferedReader bfn = new BufferedReader(
	            new InputStreamReader(System.in));
		
	    String s = bfn.readLine();
	    
	    char[] charr = s.toCharArray();
	    int i=0;
	    int j=s.length()-1;
	    
	    while (i < j)
	    {
	        charr[i] ^= charr[j];
	        charr[j] ^= charr[i];
	        charr[i] ^= charr[j];
	  
	        ++i;
	        --j;
	    }
	    
	    System.out.println("Reversed Stringr: "+String.valueOf(charr));
	}
}
