package D1_반복문1_알고리즘;

public class 반복문1_평가문제_약수2_문제 {
	/*
	 * [문제]
	 *  18의 약수의 갯수 더하기  21의 약수의 갯수를 출력하시오.
	 */
	public static void main(String[] args) {
		int i=1;
		int a=0;
		int c1=0;
		int c2=0;
		
		while(i<=21) {
			if(21%i==0) {
				c1++;
			}
			if(18%i==0) {
				c2++;
			}
			i++;
		}
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("합 : " + (c1+c2));
	
	}
}