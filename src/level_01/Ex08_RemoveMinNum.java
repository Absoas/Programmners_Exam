package level_01;

public class Ex08_RemoveMinNum {

	public int[] solution(int[] arr) {

		int temp=0;
		
		for (int x = 0; x < arr.length; x++) {
			
			temp= arr[0];
			
			if(temp > arr[x]) {
				
			}
			temp = arr[x];
			
			
		}

		int[] answer = {};
		
		return answer;
	}

	public static void main(String[] args) {

		Ex08_RemoveMinNum so = new Ex08_RemoveMinNum();

		int[] array = { 1, 2, 3, 4, 5, 6 };
		System.out.println(so.solution(array));

	}
}
