package string;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Anagram {
	public static void main(String[] args) throws IOException 
	{
		
		System.out.print("Enter the String1: ");

		BufferedReader bfn1 = new BufferedReader(
	            new InputStreamReader(System.in));
		
	    String s1 = bfn1.readLine();
	    
		System.out.print("Enter the String2: ");
		
		bfn1 = new BufferedReader(
	            new InputStreamReader(System.in));
	    String s2 = bfn1.readLine();
	    
	    if(s1.length()!=s2.length())
	    {
	    	System.out.println("No");
	    }
	    
	    char charr1[] = s1.toCharArray();
	    char charr2[] = s2.toCharArray();
	    
	    Arrays.sort(charr1);
	    Arrays.sort(charr2);
	    
	    if(Arrays.equals(charr1, charr2))
	    {
	    	System.out.println("Yes");
	    }
	    else
	    {
	    	System.out.println("No");
	    }
	}
}
