package D5_�ݺ���5_�˰���;

public class �ݺ���5_�˰���_�����1_���� {
	/*
	  
	  	[����]
	   		12�� 15�� ������� �����ͺ��� ������� 5���� ��� 
	 */
	public static void main(String[] args) {
		int a = 12;
		int b = 15;
		int num = 1;
		int count = 0;
		while(true) {
			if(num%a == 0 && num%b == 0) {
				System.out.print(num + " ");
				count++;
			}
			if(count == 5) {
				System.out.println();
				break;
			}
			num++;
		}
		//1���� ���������� 12�� 15�� ���������� Ȯ���ϴ� ��
	
		int num1 = a;
		int num2 = b;
		for(int i = 1; i == 1;) {
			if(num1 < num2) {
				num1 += a;
			}else if(num2 < num1) {
				num2 += b;
			}else if(num1 == num2) {
				System.out.println(num1);
				i = 0;
			}
			
		}
		//12�� 15�� ������Ű�鼭 ���ϸ� ����� ã�� ��
	}
}