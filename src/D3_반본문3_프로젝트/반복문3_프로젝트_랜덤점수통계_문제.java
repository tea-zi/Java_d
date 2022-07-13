package D3_반본문3_프로젝트;

import java.util.Random;

public class 반복문3_프로젝트_랜덤점수통계_문제 {
	/*
	 * [랜덤점수통계]
	 * 
	 * 1. 10회 반복을 한다.
	 * 2. 1~100 사이의 랜덤 숫자를 저장한다.(학생의 성적)
	 * 3. 성적이 60점 이상이면 합격생이다.
	 * ---------------------------------------
	 * . [1] 전교생(10명)의 총점과 평균을 출력한다.
	 * . [2] 합격자 수를 출력한다.
	 * . [3] 1등 학생의 번호와 성적을 출력한다.
	 */

	public static void main(String[] args) {
		Random ran = new Random();
		int score;
		int count = 0;
		int max = 0;
		int sum = 0;
		int avg = 0;
		int c2 = 0;
		for(int i=1; i<=10; i++) {
			score=ran.nextInt(101);
			System.out.print(score + " ");
			sum = sum+score;
			if(score>=60) {
				count++;
				if(max < score) {
					max = score;
					c2 = i;
				}
			}
		}
		avg = sum/10;
		System.out.printf("전교생 총점 : %d , 평균 : %d\n",sum ,avg);
		System.out.printf("합격자 수 : %d\n", count);
		System.out.printf("1등 %d번학생 점수 : %d",c2 ,max);
	}

}