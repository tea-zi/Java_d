package D2_�ݺ���2_�˰���;

public class �ݺ���2_�˰���_������_���� {
	/*
	 * [����]
		ö���� ������ x �� y �������� �����Ÿ� Ÿ�� �պ��Ͽ���. 
		������ �ü�15km , �ö��� �ü�12km �� �̵��Ͽ� ��  45���� �ɷ����� , 
		�������� x , y �Ÿ��� ���Ͻÿ�.
	 */
	public static void main(String[] args) {		
		double a = 15/60.0;
		double b = 12/60.0;
		double c = 45;
		double m=0;
		int i = 1;
		
		while(i<=45) {
			if(i*a == (c-i)*b) {
				m=i;
			}
			i++;
		}
		System.out.println(m);
		System.out.println(m*a);
		
		/*
		double ������1 = 15/60.0;
		double ������2 = 12/60.0;
		
		int �ѽð� = 45;
		int b = �ѽð�;
		int c = 0;
		
			
		int run = 1;
		while(run == 1) {
			if(������1 * b == ������2 * c && b + c == �ѽð�) {
				System.out.println(b + " " + c);
				System.out.println("�Ÿ� : " + ������1 * b);
			}
			b -= 1;
			c += 1;
		}
		*/
	
		
		
	}
}