package D2_�ݺ���2_������Ʈ;

import java.util.Random;

public class �ݺ���2_������Ʈ_�ڸ������_���� {
	/*
	 * [����]
		 [1] 1~99999 ������ �������ڸ� �����ϰ� �ڸ����� ���ڸ����� ����ϰ�,
		 [2] ���߿� 9�� ������ ���.
		 
		 ��) 8 ==> 1 , 0
		 ��) 102 ==> 3 , 0
		 ��) 88 ==> 2 , 0
		 ��) 919 ==> 3, 2
	 */
	public static void main(String[] args) {
		Random ran = new Random();
		int num = ran.nextInt(9)+1;
		int a = 1;
		int c = 0;
		int i = 1;
		while(i==1) {
			if(num/a != 0) {
				c++;
			}
			else {
				i=0;
			}
			a=a*10;
		}
		System.out.println(num + " " + c);
		
		int �ڸ��� = 0;	
		int �ӽ� = num;
		
		int run = 1;
		while(run == 1) {
			�ӽ� = �ӽ� / 10;		
			System.out.println(�ӽ�);
			if(�ӽ� == 0) {
				run = 0;
			}
			�ڸ��� += 1;
		}
		System.out.println(num + " " + �ڸ���);
	}
}