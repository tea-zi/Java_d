package D3_�ݺ���3_�˰���;

import java.util.Scanner;

public class �ݺ���3_�˰���_�ִ밪_���� {
	/*
	 * 	[�ִ밪 ���ϱ�]
	 * 1. �ݺ����ȿ��� ����ؼ� ���� �Է¹޴´�. ( -1000 ����ū�����Է¹޴´�.)
	 * 2. �Է¹��������� ����ū���ڸ� ����Ѵ�.
	 * 3. -1000 ���� ���ϸ�  �Է��ϸ� �����Ѵ�.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max = 0;
		int num;
		//for ��
		for(int i=0; i==0;) {
			System.out.print("���� �Է� : ");
			num = scan.nextInt();
			if(num>-1000) {
				if(num>max) {
					max = num;
				}
			}
			else {
				System.out.println();
				break;
			}
		}
		System.out.println("���� ū�� : " + max);
		//while �� 
		boolean run = true;
		max = -1000;
		while(run == true) {
			num = scan.nextInt();
			if(num <= -1000) {
				System.out.println("����");
				run = false;
			}else {
				if(max < num) {
					max = num;
					System.out.println("����ū�� : " + max);
				}
				//System.out.println(num);
			}		
		}	
	}

}