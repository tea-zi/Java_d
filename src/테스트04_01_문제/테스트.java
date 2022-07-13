package 테스트04_01_문제;

import java.util.Scanner;

public class 테스트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int num = 0;
		for(int i=10; i<=1000; i+=10) {
			if(i%a < 10) {
				num = i/10;
				break;
			}
		}
		System.out.println(num);
	}

}
