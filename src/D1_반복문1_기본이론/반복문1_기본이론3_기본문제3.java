package D1_�ݺ���1_�⺻�̷�;

public class �ݺ���1_�⺻�̷�3_�⺻����3 {
	/*
	 [����1] 1~10���� �߿��� 3�̸� 7�̻��� ���� ����Ͻÿ�.
	       1 + 2 + 7 + 8 + 9 + 10
	 [����1] 37

	 [����2] 1~10���� �߿��� 3�̸� 7�̻��� ������ ����Ͻÿ�. 
			 1,2,7,8,9,10 ==> 6�� 
	 [����2] 6
	*/
	public static void main(String[] args) {
		int i=1;
		int sum=0;
		while(i<=10) {
			if(i<3 || i>=7) {
				sum=sum+i;
				if(i!=10) {
				System.out.print(i + " + ");
				}
				else {
					System.out.print(i + " = ");
				}
			}
			i++;
		}
		System.out.println(sum);
		int c=0;
		i=1;
		while(i<=10) {
			if(i<3 || i>=7) {
				c++;
			}
			i++;
		}
		System.out.println(c + "��");
		/* ������ ���� �־ ���� ������ Ǯ������ �ϳ��� ��ġ�°͵� ���� 
		 * while(i <= 10) {
			if(i < 3 || i >= 7) {
				c = c + 1;
				sum = sum + i;
				System.out.println(i);
			}
			i = i + 1;
		}
		*/
	
	}
}