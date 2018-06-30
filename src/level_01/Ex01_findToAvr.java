package level_01;



	

public class Ex01_findToAvr {
	

	 public double solution(int[] arr) {

	      double result = 0.0;

	      
	      for(int i=0; i<arr.length; i++){

	          result += arr[i];

	      }

	    
	      double answer = 0;

	  

	      answer = result / arr.length;
	      System.out.println(answer);

	      

	      return answer;

	  }
	 
	 
	public static void main(String[] args) {
	
		
		int array[] = {1,2,3,4};
		
		Ex01_findToAvr avr = new Ex01_findToAvr();
		avr.solution(array);
	}
	
}
