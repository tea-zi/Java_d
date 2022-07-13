package D4_반본문4_프로젝트;

import java.util.Scanner;

public class 반복문4_프로젝트_369개수_문제 {
	/*
	 * [369게임]
		  1~ 10000 사이의 숫자를 입력받고 
		  3이나 6이나 9의  개수출력하시오.
		  예) 9999 ==> 4
		  예) 36 ==> 2
		  예) 1 ==> 0
		  예) 222 ==> 0  
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int a=10000;
		System.out.print("숫자 입력 : ");
		int num = scan.nextInt();
		int num2 = 0;
		while(true) {
			if(num/a == 3 || num/a == 6 || num/a == 9) {
				count++;
				num2 = num%a;
				num =num2;	
			}
			a = a/10;
			if(a == 0) {
				break;
			}
		}
		System.out.println(count+"개");
		/*
		int r = scan.nextInt();
		int temp = r;
		int c = 0;
		while(true) {
			System.out.println(temp);
			int b = temp%10;
			if(b == 3 || b == 6 || b == 9) {
				c += 1;
			}
			temp = temp / 10;
			if(temp == 0) {
				break;
			}
		}
		System.out.println("----------------");
		System.out.println(count  + "개");*/
	}
}