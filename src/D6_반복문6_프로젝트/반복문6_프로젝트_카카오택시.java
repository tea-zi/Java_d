package D6_�ݺ���6_������Ʈ;

import java.util.Random;
import java.util.Scanner;

public class �ݺ���6_������Ʈ_īī���ý� {
	/*
	 * 
	 * [īī�� �ý�]
	 * 1. �մ��� �¿� ���������� �̵��ϴ� �����̴�.
	 * 2. -10~10 ������ ���� ���� 2���� ������ �������� �����Ѵ�.
	 * 3. �޴��� �Ʒ��� ����.
	 * 		1) �ӵ����� : 1~3������ ����
	 * 		2) ���⼳�� : ��(1)��(2)��(3)��(4)
	 * 		3) �̵��ϱ� : ������ �������� ������ �ӵ���ŭ �̵�
	 * 4. �Ÿ� 1ĭ �� 50���� �߰��Ǿ� ������ ��ݵ� ����Ѵ�.
	 * 5. �����ϸ� �ٽ� -10 ~ 10 ������ ���� �������� �����ȴ�.
	 */
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int ������ġx = 0;
		int ������ġy = 0;
		int ��� = 0;
		int x;
		int y;	
		int �ӵ� = 0;
		int ���� = 0;
		while(true) {
			System.out.println("[1.����][2.����]");
			int c = scan.nextInt();
			x = ran.nextInt(21)-10;
			y = ran.nextInt(21)-10;
			if(c == 1) {
			while(true) {
				System.out.println("��������ġ : " + x + " , " + y);
				System.out.println("[1.�ӵ�][2.����][3.�̵��ϱ�]");
				int s = scan.nextInt();
				if(s == 1) {
					while(true) {
						System.out.println("�ӵ��� �����ϼ���");
						System.out.println("[�ӵ�1][�ӵ�2][�ӵ�3]");
						�ӵ� = scan.nextInt();
						if(�ӵ�< 1 || �ӵ� > 3) {
							System.out.println("�ٽ��Է�");
						}
						break;
					}
				}
				else if(s == 2) {
					while(true) {
						System.out.println("���⸦ �����ϼ���");
						System.out.println("[1.��][2.��][3.��][4.��]");
						���� = scan.nextInt();
						if(���� < 1 || ���� >4) {
							System.out.println("�ٽ��Է�");
						}
						break;
					}
				}
				else if(s == 3) {
					if(���� == 1) {
						������ġx += �ӵ�;
						��� += 50*�ӵ�;
					}
					else if(���� == 2) {
						������ġx -= �ӵ�;
						��� += 50*�ӵ�;
					}
					else if(���� == 3) {
						������ġy -= �ӵ�;
						��� += 50*�ӵ�;
					}
					else if(���� == 4) {
						������ġy += �ӵ�;
						��� += 50*�ӵ�;
					}
					System.out.println("�ý���ġ : " + ������ġx + " , " + ������ġy);
					}
					if(������ġx == x && ������ġy == y) {
						System.out.println("�����߽��ϴ�.");
						System.out.println("��� : " + ���);
					break;
					}
				}
			}
			else {
				System.out.println("��������");
				break;
			}
		}
	}

}