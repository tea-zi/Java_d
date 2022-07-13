package D2_반복문2_프로젝트;

public class 반복문2_프로젝트_형동생_문제 {
	/*
	 * [문제]
		동생이 오후 1시에 집을 나간지 12 분후에 형이 동생을 따라 나섰다.
		동생은 시속 2km로 걷고 형은 시속 6km 로 달렸을때 형과 동생이 만나는 건 몇분후입니까?	 			
	 */	
	public static void main(String[] args) {		
			double a = 2/60.0;
			double b = 6/60.0;
			double c = a*12;
			System.out.println(c);
			int m = 0 ;
			int i = 1;
			while(i==1) {
				if(a*m+c == b*m) {
					System.out.println(m + "분");
					System.out.printf("총거리 : %.2f",m*b);
					i=0;
				}
				m++;
			}
			
		
	}
}