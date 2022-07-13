package D2_반복문2_알고리즘;

public class 반복문2_알고리즘_시험점수_문제 {
	
	 /*
       [문제]
	        철수는 두번의 시험에서 각각 80점과 72점을 받았다.
	        세 번째 시험에서 최소 몇 점이상을 받아야    
	        세번의 시험성정의 평균이 82점이상이 될수 있을까?
	  */
	public static void main(String[] args) {
		int a = 80;
		int b = 72;
		int c = 0;
		int i = 1;
		while(i==1) {
			if((a+b+c)/3 >= 82) {	
				System.out.println(c);
				i=0;
			}
			c++;
		}
		
		

		
		
	} 
}