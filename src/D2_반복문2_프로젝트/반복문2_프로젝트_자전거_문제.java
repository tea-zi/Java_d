package D2_반복문2_프로젝트;

public class 반복문2_프로젝트_자전거_문제 {
	/*
	 * [문제]
		학교에서 집까지 갈때 시속 15km로 자전거를 타고 가면 6km로 걸어가는거보다 
		18분  빨리 도착한다고 한다.
		학교에서 집까지의 거리를 구하시오.
	 */
	public static void main(String[] args) {		
		int a = 0; //자전거로간 시간
		double b = 15/60.0;
		int c = 0; //걸어서간 시간
		double d = 6/60.0;
		
		int i=1;
		while(i==1) {
			if(a*b == c*d && a+18 == c) {
				System.out.println(a*b);
				System.out.println(c*d);
				System.out.println(a*b == c*d && a+18 == c);
				i=0;
			}
			a++;
			c=a+18;
		}
		
		double 자전거 = 15/60.0;
		double 걷기 = 6/60.0;	
		a = 0;
		int run =1;
		while(run == 1) {
			if(a * 자전거 == a * 걷기 + 18 * 걷기) {
				System.out.println(a + " " + a * 자전거);
				run = 0;
			}
			a += 1;
		}
	}
}