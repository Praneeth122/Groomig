package string;

import java.io.IOException;
import java.util.Scanner;

public class Vowels {
	public static void main(String[] args) throws IOException {
		System.out.print("Enter the size of the array: ");
		int N;

		Scanner s1 = new Scanner(System.in);
		N = s1.nextInt();

		String[] array = new String[N];

		Scanner s2 = new Scanner(System.in);

		System.out.println("Please enter the Strings: ");

		for (int i = 0; i < array.length; i++) {
			array[i] = s2.nextLine();
		}

		int result = 0;
		for (int i = 0; i < array.length; i++) {
			char c = array[i].charAt(0);
			char d = array[i].charAt(array[i].length() - 1);
			if ((c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
					&& (d == 'a' || d == 'e' || d == 'i' || d == 'o' || d == 'u')) {
				result++;
			}
		}
		
		System.out.println(result);
	}
}
