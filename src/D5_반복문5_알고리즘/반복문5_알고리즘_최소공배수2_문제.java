package D5_�ݺ���5_�˰���;

public class �ݺ���5_�˰���_�ּҰ����2_���� {
	/*
	 * [����]
	   	ö���� �μ��� ���� �����忡 �ٴѴ�
	   	ö���� 4�ϸ��� �ѹ��� ���� �μ��� 5�ϸ����ѹ��� ����.
	   	ö���� �μ��� 2�� 3�ϳ� ó�������ٸ� ������ ���� ������ ���� �����ΰ�?
	 */
	public static void main(String[] args) {
		int a = 4;
		int b = 5;
		int n1 = a;
		int n2 = b;
		
		while(true) {
			if(n1 == n2) {
				break;
			}
			else if(n1>n2) {
				n2 +=b;
			}
			else {
				n1 +=a;
			}
		}
		System.out.println("ö���� �μ��� "+ n1 +"�� �ڿ� ������");
	}
}