package D2_반복문2_알고리즘;

public class 반복문2_알고리즘_편의점_문제 {
	/*
	 * [문제]
		철수가 편의점의 한개에 1000원인 흰우유와 한개에 1200원인 초코우유를 몇개 사서 
		총 15개의 우유를 샀다.
		20000원을 내고 4200원을 거슬러받았을때 철수가산 흰우유는 몇개인가요??
	 */	
	public static void main(String[] args) {		
			
		
		int white = 1000;
		int choco = 1200;
		int money = 15800;
		
		int a = 0;
		int b= 0;
		int c = 15;
		int i = 0;
		while(i==0) {
			if(a+b==c && a*white+b*choco==money) {
				i=1;
				System.out.println(a);
				System.out.println(a*white+b*choco==money && a+b==c);
			}
			a++;
			b=c-a;
		}
	}
}