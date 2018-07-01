package level_01;

public class Ex05_WaterMelon {
	public String solution(int n) {
		
		String answer="";
		
		for(int i=0; i <= n+1; i++) {
			if(i % 2 == 0) {
				answer += "수";
			}else {
				answer += "박";
			}	
		}
		
		  return answer.substring(0,n);
	  }

	public static void main(String[] args) {

		Ex05_WaterMelon so = new Ex05_WaterMelon();

		System.out.println(so.solution(7));

	}
	
	
}
