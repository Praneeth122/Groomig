package String;

import java.util.Arrays;

public class LongestCommenPrefix {
	
    public static void main(String[] args)
    {
        String[] input = {"flower","flow","flight"};
        
        String output;
        
        int size = input.length;

        if (size == 0)
            output = "";
 
        if (size == 1)
            output = input[0];
 
        Arrays.sort(input);
 
        int end = Math.min(input[0].length(), input[size-1].length());
        
        int i = 0;
        while (i < end && input[0].charAt(i) == input[size-1].charAt(i) )
            i++;
 
        output = input[0].substring(0, i);
        
        System.out.println(output);
    }
}
