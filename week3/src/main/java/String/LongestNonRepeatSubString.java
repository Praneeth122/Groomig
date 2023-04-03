package String;

public class LongestNonRepeatSubString {
    public static int longestUniqueSubsttr(String str)
    {
        String test = "";
 
        int maxLength = -1;
 
        if (str.isEmpty()) {
            return 0;
        }
        
        else if (str.length() == 1) {
            return 1;
        }
        
        for (char c : str.toCharArray()) {
            String current = String.valueOf(c);
 
            if (test.contains(current)) {
                test = test.substring(test.indexOf(current) + 1);
            }
            
            test = test + String.valueOf(c);
            maxLength = Math.max(test.length(), maxLength);
        }
 
        return maxLength;
    }

  public static void main(String[] args)
    {
        String str = "sajbdfgdhyvayih";
        System.out.println("Input: "+ str);
 
        int len = longestUniqueSubsttr(str);
        System.out.println("Output : " + len);
    }
}