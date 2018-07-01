package level_01;

public class Ex04_AddTwoIntegers {

	public long solution(int a, int b) {

		long answer = 0;

		if (a < b) {
			for (int y = a; y <= b; y++) {

				answer += y;
			}
		} else if (a > b) {
			for (int y = b; y <= a; y++) {

				answer += y;
			}
		}else {
			answer = a;
		}
		
		System.out.println(answer);

		return answer;
	}

	public static void main(String[] args) {

		Ex04_AddTwoIntegers so = new Ex04_AddTwoIntegers();

		so.solution(5, 7);

	}
}
