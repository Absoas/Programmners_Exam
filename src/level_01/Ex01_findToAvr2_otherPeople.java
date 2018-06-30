package level_01;

import java.util.Arrays;
	

public class Ex01_findToAvr2_otherPeople {
	

	public int getMean(int[] array) {
	      if(array == null){
	        return 0;
	      }

	      int ret = 0;
	      if(array != null){
	        for(int n : array){
	            ret += n;
	        }
	      }
	        return ret / array.length;
	    }

	    public static void main(String[] args) {
	        int x[] = {5, 4, 3};
	        Ex01_findToAvr2_otherPeople getMean = new Ex01_findToAvr2_otherPeople();
	        // 아래는 테스트로 출력해 보기 위한 코드입니다.
	        System.out.println("평균값 : " + getMean.getMean(x));
	    }
}
