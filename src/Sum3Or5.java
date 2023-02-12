import java.util.*;

public class Sum3Or5 {
	public static void main(String[] args) {
		System.out.println(solution(10));

	}
	public static int solution(int number) {
		List<Integer> ele = new ArrayList<>();
		if (number < 0 ){ return -1;}
		for(int i = 0; i < number; i++){
			if (i%3 == 0 || i%5 ==0){
				ele.add(i);
			}
		}
		return ele.stream().mapToInt(Integer::intValue).sum();//using stream methods in java, its a seperatte interface with many uses.

	}

}
