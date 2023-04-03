package autoboxandunbox;

public class Boxingandunboxing {
    public static void main(String[] args)
    {
    	
    	
        Integer i = new Integer(10);
 
        // Unboxing the Object
        int i1 = i;
 
        //auto boxing 
        int i2 = new Integer(i1);
        // Print statements
        System.out.println(i1);
        System.out.println(i2);
    }
}
