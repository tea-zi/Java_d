package D2_�ݺ���2_������Ʈ;

public class �ݺ���2_������Ʈ_������_���� {
	/*
	 * [����]
		������ ���� 1�ÿ� ���� ������ 12 ���Ŀ� ���� ������ ���� ������.
		������ �ü� 2km�� �Ȱ� ���� �ü� 6km �� �޷����� ���� ������ ������ �� ������Դϱ�?	 			
	 */	
	public static void main(String[] args) {		
			double a = 2/60.0;
			double b = 6/60.0;
			double c = a*12;
			System.out.println(c);
			int m = 0 ;
			int i = 1;
			while(i==1) {
				if(a*m+c == b*m) {
					System.out.println(m + "��");
					System.out.printf("�ѰŸ� : %.2f",m*b);
					i=0;
				}
				m++;
			}
			
		
	}
}