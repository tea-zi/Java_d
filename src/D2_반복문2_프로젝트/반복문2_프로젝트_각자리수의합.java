package D2_�ݺ���2_������Ʈ;

import java.util.Random;

public class �ݺ���2_������Ʈ_���ڸ������� {
	public static void main(String[] args) {
		Random ran = new Random();
		/*
		 * [����]
			 1~999 ������ �������ڸ� �����ϰ� �� �ڸ����� ���� ����Ͻÿ�.
			 ��) 8 ==> 8
			 ��) 28 ==> 2 + 8
			 ��) 999 ==> 9 + 9 + 9
		 */
		int num = ran.nextInt(999)+1;
		System.out.println(num);
		int i = 100;
		int sum =0;
		while(i>=1) {
			System.out.print(num/i + " ");
			sum=sum+num/i;
			num = num%i;
			i=i/10;
		}
		System.out.println();
		System.out.println("�� : " + sum);
	}
}