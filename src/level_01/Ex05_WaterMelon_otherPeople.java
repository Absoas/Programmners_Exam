package level_01;

public class Ex05_WaterMelon_otherPeople {
//	public String solution(int n) {
//
//		return new String(new char[n / 2 + 1]).replace("\0", "수박").substring(0, n);
//	}
//
//	public static void main(String[] args) {
//
//		Ex05_WaterMelon_otherPeople so = new Ex05_WaterMelon_otherPeople();
//
//		System.out.println(so.solution(5));
//
//	}
	
	public String watermelon(int n){
	    String result = "";
	    for (int i = 0; i < n; i++)
	      result += i % 2 == 0 ? "수" : "박";
	        return result;
	    }


	public static void main(String[] args) {

		Ex05_WaterMelon_otherPeople so = new Ex05_WaterMelon_otherPeople();

		System.out.println(so.watermelon(5));
		System.out.println(so.watermelon(7));
		

	}
}
