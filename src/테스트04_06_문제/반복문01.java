package 테스트04_06_문제;

public class 반복문01 {
	public static void main(String[] args) {
		/*
		 
	[문제]
		[1] 1~150 까지의 18의 배수를 전부 출력한다.
		[2] 50 ~ 100의 배수는 숫자대신 "배수" 출력  
	[정답]
		18 36 배수 배수 배수 108 126 144
		 */
		for(int i=1; i<=150; i++) {
			if(i%18 == 0) {
				if(i>=50 && i<=100) {
					System.out.print("배수 ");
				}
				else {
					System.out.print(i + " ");
				}
			}
		}
	}
}