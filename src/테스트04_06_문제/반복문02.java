package �׽�Ʈ04_06_����;

public class �ݺ���02 {
	public static void main(String[] args) {
		/*		 
		  	�ݺ����� ����� 7�ǹ���� ����Ѵ�. 
		  	��, 1000���� ũ�� 100�� �ڸ��� 7�� ����° ����� ����Ѵ�.	  	
		  	[����]
		  		1715
		 */  
		int i=0;
		int count=0;
		while(true) {
			i++;
			if(i%7 ==0) {
				if(i>1000 && i%1000/100 == 7) {
					count++;
				}
			}
			if(count == 3) {
			System.out.println(i);
			break;
			}

		}
	}
}