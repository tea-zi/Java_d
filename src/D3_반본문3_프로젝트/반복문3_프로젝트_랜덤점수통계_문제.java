package D3_�ݺ���3_������Ʈ;

import java.util.Random;

public class �ݺ���3_������Ʈ_�����������_���� {
	/*
	 * [�����������]
	 * 
	 * 1. 10ȸ �ݺ��� �Ѵ�.
	 * 2. 1~100 ������ ���� ���ڸ� �����Ѵ�.(�л��� ����)
	 * 3. ������ 60�� �̻��̸� �հݻ��̴�.
	 * ---------------------------------------
	 * . [1] ������(10��)�� ������ ����� ����Ѵ�.
	 * . [2] �հ��� ���� ����Ѵ�.
	 * . [3] 1�� �л��� ��ȣ�� ������ ����Ѵ�.
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
		System.out.printf("������ ���� : %d , ��� : %d\n",sum ,avg);
		System.out.printf("�հ��� �� : %d\n", count);
		System.out.printf("1�� %d���л� ���� : %d",c2 ,max);
	}

}