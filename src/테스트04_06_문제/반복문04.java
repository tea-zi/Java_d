package �׽�Ʈ04_06_����;

public class �ݺ���04 {
	public static void main(String[] args) {
		/*		 
	  	�ݺ����� ����� 7�ǹ���� ����Ѵ�. 
	  	��, 1000���� ũ�� 100�� �ڸ��� 7�̰� ���� �ڸ��� 3�� ����� �ټ����� ���������� ������� ����Ѵ�.	  	
	  	1743
		2723
		2793
		3703
		3773
	 */
		int i=0;
		int count = 0;
		while(true) {
			i++;
			if(i%7 == 0) {
				if(i>1000 && i%1000/100 == 7 && i%10 == 3) {
					count++;
					System.out.print(i + " ");
					System.out.println(i%7);
				}
			}
			if(count == 5) {
				break;
			}
		}
	}
}