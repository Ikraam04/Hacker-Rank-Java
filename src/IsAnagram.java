import java.util.*;
//https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
public class IsAnagram {
	public static void main(String[] args) {
		Scanner strings = new Scanner(System.in);
		String s1 = strings.nextLine().toLowerCase(), s2 = strings.nextLine().toLowerCase();
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if (Arrays.equals(arr1, arr2)) {
			System.out.println("Anagrams");
		} else {
			System.out.println("Not Anagrams");
		}
	}
}


