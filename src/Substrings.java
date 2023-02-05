import java.util.*;
public class Substrings {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int n = scan.nextInt();

		String smallest = s.substring(0, n);//substring from index 0  to index n
		String largest = s.substring(0, n);// where n is the max length of the substring
		for (int i = 1; i <= s.length() - n; i++) {
			String substr = s.substring(i, i + n);//create substring between i and i+n (again , this is in the loop so it resets each time)
			if (substr.compareTo(smallest) < 0) { //if it's smaller than the currently stored one replace
				smallest = substr;
			}
			if (substr.compareTo(largest) > 0) {//if it's bigger than the current one replace
				largest = substr;
			}
		}

		System.out.println(smallest);
		System.out.println(largest);
	}
}
//https://www.hackerrank.com/challenges/java-string-compare/problem?isFullScreen=true