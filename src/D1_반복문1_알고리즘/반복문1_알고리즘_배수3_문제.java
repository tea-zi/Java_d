package D1_반복문1_알고리즘;

public class 반복문1_알고리즘_배수3_문제 {
	/*
	 * [문제] 
		  50에서 100까지 자연수중에서 9의 배수의 개수를 출력하시오.
		  [예] (54,63,72,81,90,99)  6 개 
	 */
	public static void main(String[] args) {
		int c=0;
		int i=50;
		while(i<=100) {
			if(i%9==0) {
				c++;
				System.out.print(i+" ");
			}
			i++;
		}
		System.out.println(c + "개");
	}
}