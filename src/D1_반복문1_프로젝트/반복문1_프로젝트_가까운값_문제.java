package D1_�ݺ���1_������Ʈ;

public class �ݺ���1_������Ʈ_����_���� {
	/*
	 * [����] 
	 * 		1 ���� 200 ������ ������ ���� ���ǿ� ���� �´� ���ڸ� ���.
	 *     	[����1] 6�� ��������
	 *      [����2] 100�� ���尡��� ���� ��� 
	 		
	 		���� : 102
	 */
	  
	public static void main(String[] args) {
		int i=1;
		int min=100;
		int min2=0;
		int c=0;
		int d=100;
		while(i<=200) {
			if(i%6==0) {
				//System.out.print(i + " ");
				c=i-100;
				if(c < 0)
					c=c*-1;
				//System.out.println(c);
				if(c<d) {
					d=c;
					min = i;
					//System.out.println(min);
				}
				else if(c==d) {
					min2=i;
				}
			}
			i++;
		}
		if(min2==0) {
			System.out.println(min);
		}
		else {
			System.out.println(min + " " +min2);
		}
		/*int limit = 100;
		int start = 1;
		int max = 200;
		int num = 6;
		int i = start;	
		int front = 0;
		int back = 0;
		while(i <= max) {
			if(i % num == 0 && i <= limit) {
			//	System.out.println(i);
				front = i;
			}		
			i += 1;
		}
		//System.out.println(front);
		back = front + num;
		//System.out.println(front + " " + back);	
		if(limit - front > back - limit) {
			System.out.println(back);
		}else if(limit - front < back - limit) {
			System.out.println(front);
		}else if(limit - front == back - limit){
			System.out.println(front + " " + back);
		}*/
		
	}
}