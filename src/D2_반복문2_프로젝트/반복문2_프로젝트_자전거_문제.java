package D2_�ݺ���2_������Ʈ;

public class �ݺ���2_������Ʈ_������_���� {
	/*
	 * [����]
		�б����� ������ ���� �ü� 15km�� �����Ÿ� Ÿ�� ���� 6km�� �ɾ�°ź��� 
		18��  ���� �����Ѵٰ� �Ѵ�.
		�б����� �������� �Ÿ��� ���Ͻÿ�.
	 */
	public static void main(String[] args) {		
		int a = 0; //�����ŷΰ� �ð�
		double b = 15/60.0;
		int c = 0; //�ɾ�� �ð�
		double d = 6/60.0;
		
		int i=1;
		while(i==1) {
			if(a*b == c*d && a+18 == c) {
				System.out.println(a*b);
				System.out.println(c*d);
				System.out.println(a*b == c*d && a+18 == c);
				i=0;
			}
			a++;
			c=a+18;
		}
		
		double ������ = 15/60.0;
		double �ȱ� = 6/60.0;	
		a = 0;
		int run =1;
		while(run == 1) {
			if(a * ������ == a * �ȱ� + 18 * �ȱ�) {
				System.out.println(a + " " + a * ������);
				run = 0;
			}
			a += 1;
		}
	}
}