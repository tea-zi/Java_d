package D4_�ݺ���4_������Ʈ;

import java.util.Scanner;

public class �ݺ���4_������Ʈ_369����_���� {
	/*
	 * [369����]
		  1~ 10000 ������ ���ڸ� �Է¹ް� 
		  3�̳� 6�̳� 9��  ��������Ͻÿ�.
		  ��) 9999 ==> 4
		  ��) 36 ==> 2
		  ��) 1 ==> 0
		  ��) 222 ==> 0  
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int a=10000;
		System.out.print("���� �Է� : ");
		int num = scan.nextInt();
		int num2 = 0;
		while(true) {
			if(num/a == 3 || num/a == 6 || num/a == 9) {
				count++;
				num2 = num%a;
				num =num2;	
			}
			a = a/10;
			if(a == 0) {
				break;
			}
		}
		System.out.println(count+"��");
		/*
		int r = scan.nextInt();
		int temp = r;
		int c = 0;
		while(true) {
			System.out.println(temp);
			int b = temp%10;
			if(b == 3 || b == 6 || b == 9) {
				c += 1;
			}
			temp = temp / 10;
			if(temp == 0) {
				break;
			}
		}
		System.out.println("----------------");
		System.out.println(count  + "��");*/
	}
}