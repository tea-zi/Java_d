package D4_�ݺ���4_������Ʈ;

import java.util.Random;

public class �ݺ���4_������Ʈ_�ִ밪���� {
	public static void main(String[] args) {
		/*
		 * [����] 
		 * 	�������� 1~10 �� 10������ϰ� , 
		 *  ����ū���� ������ ���°�� �ߺ���µ� Ƚ������Ͻÿ�.
		 */
		Random ran = new Random();
		int max = 0;
		int count = 0;
		for(int i=1; i<=10; i++) {
			int num = ran.nextInt(10)+1;
			System.out.print(num + " ");
			if(num>max) {
				max = num;
				count = 0; //�ؿ� ���ǹ��� else if�� �ϰԵǸ� count �ʱ�ȭ���� 1�̿����Ѵ�.
			}
			if(max == num) {
				count++;
			}
		}
		System.out.printf("\n �ߺ�Ƚ�� : %d",count);
	} 
}