package D1_�ݺ���1_�˰���;

public class �ݺ���1_�˰���_���3_���� {
	/*
	 * [����] 
		  50���� 100���� �ڿ����߿��� 9�� ����� ������ ����Ͻÿ�.
		  [��] (54,63,72,81,90,99)  6 �� 
	 */
	public static void main(String[] args) {
		int c=0;
		int i=50;
		while(i<=100) {
			if(i%9==0) {
				c++;
				System.out.print(i+" ");
			}
			i++;
		}
		System.out.println(c + "��");
	}
}