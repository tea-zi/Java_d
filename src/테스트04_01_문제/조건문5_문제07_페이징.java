package �׽�Ʈ04_01_����;

import java.util.Scanner;

/*
	[����]
		[1] ���� a��  1~1000�� �Է¹޴´�.
		[2] a�� ���� 1~10 �̸� num�� 1�� ���� ������ ����Ѵ�.
		[3] a�� ���� 11~20 �̸� num�� 2�� ���� ������ ����Ѵ�.
		...
		[4] a�� ���� 91~100 �̸� num�� 10�� ������ ����Ѵ�.
		...
		[5] a�� ���� 981 ~ 990 �̸� num �� 99 �� ������ ����Ѵ�.
		[5] a�� ���� 991 ~1000 �̸� num �� 100�� ������ ����Ѵ�. 
 */
public class ���ǹ�5_����07_����¡ {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int num = 0;
		if(a%10 == 0) {
			num = a/10;
		}
		else {
			num = (a+10)/10;
		}
		System.out.println(num);
	}
}