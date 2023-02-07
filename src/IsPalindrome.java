import java.util.*;

public class IsPalindrome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StringBuilder s1 = new StringBuilder(input.nextLine());
		Boolean result = (s1.toString().equals(s1.reverse().toString())) ? Boolean.TRUE : Boolean.FALSE;
		System.out.println(result);
		System.out.println("hello world");


	}
}
//https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=true