package D2_�ݺ���2_�˰���;

public class �ݺ���2_�˰���_������_���� {
	/*
	 * [����]
		ö���� �������� �Ѱ��� 1000���� ������� �Ѱ��� 1200���� ���ڿ����� � �缭 
		�� 15���� ������ ���.
		20000���� ���� 4200���� �Ž����޾����� ö������ ������� ��ΰ���??
	 */	
	public static void main(String[] args) {		
			
		
		int white = 1000;
		int choco = 1200;
		int money = 15800;
		
		int a = 0;
		int b= 0;
		int c = 15;
		int i = 0;
		while(i==0) {
			if(a+b==c && a*white+b*choco==money) {
				i=1;
				System.out.println(a);
				System.out.println(a*white+b*choco==money && a+b==c);
			}
			a++;
			b=c-a;
		}
	}
}