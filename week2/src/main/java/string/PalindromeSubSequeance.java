package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeSubSequeance {
	public static void main(String[] args) throws IOException 
	{
		System.out.print("Enter the String: ");

		BufferedReader bfn = new BufferedReader(
	            new InputStreamReader(System.in));
		
	    String s = bfn.readLine();
	    
        int i = 0, j = s.length() - 1;
        boolean flag = true;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                 System.out.println("2");
                 flag = false;
                 break;
            }
        }
        
        if(flag) System.out.println("1");
        
	}
}
