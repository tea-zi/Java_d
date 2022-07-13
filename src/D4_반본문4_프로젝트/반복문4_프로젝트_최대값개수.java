package D4_반본문4_프로젝트;

import java.util.Random;

public class 반복문4_프로젝트_최대값개수 {
	public static void main(String[] args) {
		/*
		 * [문제] 
		 * 	랜덤으로 1~10 를 10번출력하고 , 
		 *  가장큰수가 여러번 나온경우 중복출력된 횟수출력하시오.
		 */
		Random ran = new Random();
		int max = 0;
		int count = 0;
		for(int i=1; i<=10; i++) {
			int num = ran.nextInt(10)+1;
			System.out.print(num + " ");
			if(num>max) {
				max = num;
				count = 0; //밑에 조건문을 else if로 하게되면 count 초기화값은 1이여야한다.
			}
			if(max == num) {
				count++;
			}
		}
		System.out.printf("\n 중복횟수 : %d",count);
	} 
}