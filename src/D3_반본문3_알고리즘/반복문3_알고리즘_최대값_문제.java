package D3_반본문3_알고리즘;

import java.util.Scanner;

public class 반복문3_알고리즘_최대값_문제 {
	/*
	 * 	[최대값 구하기]
	 * 1. 반복문안에서 계속해서 값을 입력받는다. ( -1000 보다큰수만입력받는다.)
	 * 2. 입력받은숫자중 가장큰숫자를 출력한다.
	 * 3. -1000 보다 이하를  입력하면 종료한다.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max = 0;
		int num;
		//for 문
		for(int i=0; i==0;) {
			System.out.print("숫자 입력 : ");
			num = scan.nextInt();
			if(num>-1000) {
				if(num>max) {
					max = num;
				}
			}
			else {
				System.out.println();
				break;
			}
		}
		System.out.println("가장 큰수 : " + max);
		//while 문 
		boolean run = true;
		max = -1000;
		while(run == true) {
			num = scan.nextInt();
			if(num <= -1000) {
				System.out.println("종료");
				run = false;
			}else {
				if(max < num) {
					max = num;
					System.out.println("가장큰수 : " + max);
				}
				//System.out.println(num);
			}		
		}	
	}

}