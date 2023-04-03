package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MactingSubsequeance {
	public static void main(String[] args) throws IOException {
		
		System.out.print("Enter the String1: ");

		BufferedReader bfn1 = new BufferedReader(new InputStreamReader(System.in));

		String string = bfn1.readLine();
		
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

		Map<String, Integer> map = new HashMap<>();
		for (String str : array) {
			map.put(str, map.getOrDefault(str, 0) + 1);
		}

		int ans = 0;
		char ch[] = string.toCharArray();

		for (String str : map.keySet()) {

			char temp[] = str.toCharArray();
			int i = 0;
			int j = 0;

			while (i < ch.length && j < temp.length) {
				if (ch[i] == temp[j]) {
					i++;
					j++;
				} else {
					i++;
				}
			}

			if (j == temp.length) {
				ans += map.get(str);
			}

		}
		
		System.out.println(ans);
	}
}
