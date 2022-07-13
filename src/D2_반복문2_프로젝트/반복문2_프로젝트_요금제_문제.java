package D2_반복문2_프로젝트;

public class 반복문2_프로젝트_요금제_문제 {
	/*
	 * [문제]
		  아래와같은 휴대요금제가 있다 
		  B를 선택할경우 A보다 더 경제적이될려면,
		  통화시간을 얼마까지 사용해야될까요? 
		  정답을 초로 구하시오.
		  A요금제 기본요금 17500원 초당 5원 
		  B요금제 기본요금 31000원 초당 2원
	  
	 */
	
	public static void main(String[] args) {
		int i =0;
		int s=0;
		while(i==0) {
			if(s*5+17500 > 31000+2*s) {
				System.out.println(s+"초");
				System.out.println(5*s+17500>3100+2*s);
				i=1;
			}
			s++;
		}
		
		
	}
}