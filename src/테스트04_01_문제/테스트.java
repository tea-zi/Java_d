package �׽�Ʈ04_01_����;

import java.util.Scanner;

public class �׽�Ʈ {

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
