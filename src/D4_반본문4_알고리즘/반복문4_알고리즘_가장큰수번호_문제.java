package D4_�ݺ���4_�˰���;

import java.util.Random;

public class �ݺ���4_�˰���_����ū����ȣ_���� {
	/*
	  [����1] �ݺ����� ����Ͽ� �������� 1~9 �� 5������Ѵ�. 
	       1) ����������  ����ū���� ��ȣ�� ���
             (��ȣ�� ��¼����̴�.)
	       2) ����ū���� �������ִٸ� ����ù��° ��ȣ�� ��� 
	      ��) 
	      		1, 7, 4, 7, 5 ==>   ����ū�� : 7 ,  ��ȣ : 2  
	         	����ū���� 2������ ù��°��ȣ�� ���

	  [����2] �ݺ����� ����Ͽ� �������� 1~9 �� 5������Ѵ�. 
	       1) ����������  ����ū���� ��ȣ�� ���
             (��ȣ�� ��¼����̴�.)
	       2) ����ū���� �������ִٸ� ���帶���� ��ȣ�� ��� 
	      ��) 
	      		1, 7, 4, 7, 5 ==>   ����ū�� : 7 , ��ȣ : 4  
	      		����ū���� 2������ ������ ��ȣ�� ���
   */
	public static void main(String[] args) {
		Random ran = new Random();
		int max =0;
		int c=0;
		for(int i=1; i<=9; i++) {
			int num = ran.nextInt(9)+1;
			System.out.print(num);
			if(num > max) {
				max = num;
				c = i;
			}
		}
		System.out.printf("����ū�� : %d , ��ȣ : %d\n",max ,c);
		
		for(int i=1; i<=9; i++) {
			int num = ran.nextInt(9)+1;
			System.out.print(num);
			if(num >= max) {
				max = num;
				c = i;
			}
		}
		System.out.printf("����ū�� : %d , ��ȣ : %d\n",max ,c);
	} 
}