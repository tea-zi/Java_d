package D1_반복문1_알고리즘;

public class 반복문1_알고리즘_세자리수_문제 {
	
	/*
	 * [문제]
	 *  28의 배수 중에서 가장 큰 세자리 수를 출력하시오.
	 *  답 : 980 
	 */
	public static void main(String[] args) {
		int i = 0;
		int max=0;
		while(i<1000) {
			max=i;
			i=i+28;
		}
		System.out.println(max);
		max=0;
		i=1;
		int c=0;
		while(i==1) {
			if(c<1000 && c>=100) {
				if(c%28==0) {
					max=c;
					c++;
				}
				else {
					c++;
				}
			}
			else if(c<100) {
				c++;
			}
			else {
				i=0;
			}
		}
		System.out.println(max);

	}
}