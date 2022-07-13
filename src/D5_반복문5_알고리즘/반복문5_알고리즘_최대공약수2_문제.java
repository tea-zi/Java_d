package D5_반복문5_알고리즘;

public class 반복문5_알고리즘_최대공약수2_문제 {
	/*
		[문제] 
			연필 42자루와 지우개 28개를 최대한 많은 학생에가 남김없이
	  	  	똑같이 나누어 주려고합니다. 몇명까지 나누어 줄수있는지 출력하시오.
	 */
	public static void main(String[] args) {
		int a = 42;
		int b = 28;
		int num = 1;
		int max = 0;
		for(int i=1; i==1;) {
			if(a%num == 0 && b%num==0) {
				max = num;
				System.out.println(num);
			}
			if(num>a || num>b) {
				break;
			}
			num++;
		}
		System.out.println("최대한 나눠줄수 있는 학생수 : "+max);
	}
}