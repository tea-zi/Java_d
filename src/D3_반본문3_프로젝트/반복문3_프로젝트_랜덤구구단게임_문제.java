package D3_�ݺ���3_������Ʈ;

import java.util.Random;
import java.util.Scanner;

public class �ݺ���3_������Ʈ_���������ܰ���_���� {
	/* 
	 *  [���������� ����] (�ݺ������)
	 * 1. ���������� ������ 10ȸ �ݺ��Ѵ�.
	 * 2. ������ ���߸� 1������ 10���̴�.
	 * 3. ���� ���� ��, ������ ����Ѵ�.
	 * 4. ��, 3����������Ʋ���� ��������ϸ� 0���̵ȴ�.
	 */
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int a;
		int b;
		int c;
		int d = 0;
		int e = 0;
		int f = 0;
		for(int i=1; i<=10; i++) {
			a = ran.nextInt(9)+1;
			b = ran.nextInt(9)+1;
			c = a*b;
			System.out.println(i + "���� : " + a + " * " + b + " = ? ");
			System.out.print("���� �Է� : ");
			d = scan.nextInt();
			if(c == d) {
				f = 0;
				System.out.println("����  ���ӿ��� : " + f);
				e = e+10;
			}
			else {
				f++;
				System.out.println("����  ���ӿ��� : " + f);
			}
			if(f == 3) {
				System.out.println("3�� ���� ����!!");
				e = 0;
				break;
			}
		}
		System.out.println(e + "��");
		
	}
}