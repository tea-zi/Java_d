package D2_�ݺ���2_�˰���;

public class �ݺ���2_�˰���_�_���� {
	/*
	 * [����]
	 * ö���� ���� 6�ÿ� 30�п�  ������ 3km ������ ������ ���µ�,
	 * ó������ �ü� 3km�� �ȴٰ� ���߿� �ü� 6km�� �޷�����.
	 * ö���� ������ 7��  10�������ߴ�.
	 * �ɾ �Ÿ��� �޷��� �Ÿ��� ���Ͻÿ�.
	 */
	public static void main(String[] args) {
		int a = 40;
		double b = 3/60.0;
		double c = 6/60.0;
		double d=3.0;
		int m=0;
		int i = 0;
		while(i<=a) {
			if(i*b+(a-i)*c==3) {
				m=i;
			}
			i++;
		}
		int n = a-m;
		System.out.println(m);
		System.out.println("�ɾ �Ÿ� : "+m*b);
		System.out.println("�پ �Ÿ� : "+n*c);
		
		System.out.println(m*b+n*c==3);
		
		
	
	}
}