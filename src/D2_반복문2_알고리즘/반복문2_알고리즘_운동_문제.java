package D2_반복문2_알고리즘;

public class 반복문2_알고리즘_운동_문제 {
	/*
	 * [문제]
	 * 철수는 저녁 6시에 30분에  집에서 3km 떨어진 공원을 가는데,
	 * 처음에는 시속 3km로 걷다가 도중에 시속 6km로 달려갔다.
	 * 철수는 공원에 7시  10에도착했다.
	 * 걸어간 거리와 달려간 거리를 구하시오.
	 */
	public static void main(String[] args) {
		int a = 40;
		double b = 3/60.0;
		double c = 6/60.0;
		double d=3.0;
		int m=0;
		int i = 0;
		while(i<=a) {
			if(i*b+(a-i)*c==3) {
				m=i;
			}
			i++;
		}
		int n = a-m;
		System.out.println(m);
		System.out.println("걸어간 거리 : "+m*b);
		System.out.println("뛰어간 거리 : "+n*c);
		
		System.out.println(m*b+n*c==3);
		
		
	
	}
}