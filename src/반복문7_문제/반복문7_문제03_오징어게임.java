package �ݺ���7_����;

import java.util.Random;
/*
	[��¡�����]
		ö���� ��¡����ӿ� �����Ͽ���.
		ù��° ������ "����ȭ���� �Ǿ����ϴ�" �̴�.
		��Ģ�� �Ʒ��Ͱ���.	
	[��Ģ]	
		[1] ��ü �Ÿ��� 0 ~ 25���� �Ÿ��� �ִ�.
		[2] ö���� ���� 0�� �ڸ��� �ִ�.
		[3] ö���� ���� 1 ~ 4�� �������ڸ��̴´�. ���ڸ�ŭ �̵��Ѵ�. 
		[4]	�̵��Ÿ��� �����ϸ�, ���� 25�̻��̵Ǹ� �¸��̸� �����Ѵ�.
		[5] ������ ���� 3 ~ 5�� �������ڸ��̴´�. 
		[6] �������� ū ���ڰ������� �����ΰ����� ���ֵǾ� �й��ϸ� �����Ѵ�.
		[7] 10�Ͼȿ� �������ϸ� �ð��ʰ��� �й��ϸ� �����Ѵ�.
		[8] ö���� �̵���θ� ���� ����Ͻÿ�.
 */
public class �ݺ���7_����03_��¡����� {
	public static void main(String[] args) {
		Random ran = new Random();
		int ö�� = 0;
		for(int i=0; i<10; i++) {
			System.out.println("==== " + (i+1) + "��° �� ====");
			int r = ran.nextInt(4)+1;
			System.out.println("r : " + r);
			ö�� += r;
			System.out.println("ö����ġ : " + ö��);
			int doll = ran.nextInt(3)+3;
			System.out.println("doll : " + doll);
			if(ö�� >= 25) {
				System.out.println("�¸�");
			}
			if(r > doll || i == 9) {
				System.out.println("�й�");
				break;
			}
			
		}
	}
}
