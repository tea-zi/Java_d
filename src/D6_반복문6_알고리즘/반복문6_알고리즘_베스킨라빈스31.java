package D6_�ݺ���6_�˰���;

import java.util.Scanner;

public class �ݺ���6_�˰���_����Ų���31 {
	/*
	 * [����Ų���31]
	 *   ����Ų��� �����̶�, �÷��̾� 2���� �����ư��鼭
	 *   1~3������ ���ڸ� �����Ҽ��ְ�, �׼��ڵ��� ��� ���ؼ� 
	 *   �״������� 31�� �������������� ���°����̴�.
	 * 
	 * 
	 * 1) �� �÷��̾�� �����ư��鼭 1~3�� �����Ѵ�.
	 * 2) ���࿡ �̻��Ѽ��ڸ� �Է��ϸ� 1~3�� �Է��Ҷ����� ����ڱ� �����̴�.
	 * 3) �� �÷��̾ �����Ѽ��ڴ�  total  ������ ��� �����ؼ� ���Ѵ�.
	 * 4) total �� 31�̻� �����ϸ� �¸��ڸ� ����Ѵ�.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int total = 0;
		/*System.out.print("�÷��̾� �� �Է� : ");
		int player = scan.nextInt();*/
		boolean run = false;
		int turn = 1;
		while(total < 31) {
			if(turn%2 == 1) {
				System.out.println("Player 1");
				run = true;
			}
			else {
				System.out.println("Player 2");
				run = true;
			}
			while(run) {
				System.out.println("[1][2][3]");
				int p = scan.nextInt();
				if(p==1 || p==2 || p==3) {
					total += p;
					System.out.println(total);
					turn++;
					run = false;
				}
				else {
					System.out.println("�ٽ� �Է��ϼ���.");
				}
			}

		} 
		if(turn%2 == 0) {
			System.out.println("Player2 Win");
		}
		else {
			System.out.println("Player1 Win");
		}
	}

}