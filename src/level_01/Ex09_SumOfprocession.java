package level_01;

public class Ex09_SumOfprocession {

	public int[][] solution(int[][] arr1, int[][] arr2) {
		
		
		int[][] answer = new int[arr1.length][arr1[0].length];
		
		
		
			for(int i=0; i<answer.length; i++) {
				for(int j=0; j<answer[0].length; j++) {
					answer[i][j] = arr1[i][j] + arr2[i][j];
				}
			}
				
		
		
		
		return answer;
	}

	public static void main(String[] args) {
		
		Ex09_SumOfprocession sa = new Ex09_SumOfprocession();
		
		int [][] x = {{1,2},
					  {3,4}};
		
		int [][] y = {{1,2},
					  {3,4}};
		
		sa.solution(x,y);
		
	}

}
