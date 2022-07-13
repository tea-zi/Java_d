package D1_반복문1_알고리즘;

public class 반복문1_알고리즘_배수2_문제 {
	/*
	 * [문제]
	 *  8의 배수를 작은수부터 4개 출력하시오. 
	 *  답 : 0,8,16,24
	 */
	
	public static void main(String[] args) {
		int i=1;
		int c=0;
	// 1
		while(i==1) {
			if(c==4) {
				i=0;
			}
			else {
				System.out.print(c*8 + " ");
			}
			c++;
		}
	// 2
		while(i<4) {
			System.out.print(i*8 + " ");
			i++;
		}
	// 3
		int num = 8;		
		int count = 0;
		i = 0;
		int run = 1;		
		while(run == 1) {
			if(i % num == 0) {
				System.out.print(i);
				count = count + 1;
				if(count == 4) {
					run = 0;
				}
			}
			i = i + 1;
		}
			
	}
}