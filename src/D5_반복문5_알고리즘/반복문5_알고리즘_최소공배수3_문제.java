package D5_�ݺ���5_�˰���;

public class �ݺ���5_�˰���_�ּҰ����3_���� {
	/*
	   	[����] 
	   		�����ŷ� ����� �ѹ������µ� ö���� 90�� , ���� �� 60�� , �μ��� 45�ʰ� �ɸ��ϴ�.
	   		�̿Ͱ��� �ӷ����� ���������� ���ÿ� ����Ͽ� ���� �������� ����� ����, 
	   		1) ������� ó������ ��������� �ٽø����ԵǴ°��� ���ʵ��Դϱ�?
	   		2) �ٽø��ٰԵǾ����� �μ��� ����� ���������Դϱ�?  		
	 */
	public static void main(String[] args) {
		int a = 90;
		int b = 60;
		int c = 45;
		int n1 = a;
		int n2 = b;
		int n3 = c;
		
		while(true) {
			if(n1 == n2 && n1 == n3 && n2 == n3) {
				break;
			}
			else if(n1 > n2 || n2 < n3) {
				n2 += b;
			}
			else if(n1 >  n3 || n2 > n3) {
				n3 += c;
			}
			else {
				n1 += a;
			}
		}
		System.out.println(n1);
		System.out.println(n1/c);
	}	
}
