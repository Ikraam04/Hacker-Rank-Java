import java.util.*;
public class TopOfAList {
	public static void main(String[] args) {
		int[] x = {5,6,34,4,1,19,24,12};
		int n = 2;
		System.out.println(Arrays.toString(largest(n, x)));
		//https://www.codewars.com/kata/53d32bea2f2a21f666000256/train/java
	}
	public static int[] largest(int n, int[] arr) {
		int[] result = new int[n];
		Arrays.sort(arr);
		for (int i = 0; i < n; i++) {
			result[i] = arr[arr.length - i - 1];
		}
		for (int i = 0; i < n/2; i++) {
			int temp = result[i];
			result[i] = result[n - i - 1];
			result[n - i - 1] = temp;
		}
		return result;
	}

}
