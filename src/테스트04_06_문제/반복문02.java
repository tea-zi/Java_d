package 테스트04_06_문제;

public class 반복문02 {
	public static void main(String[] args) {
		/*		 
		  	반복문을 사용해 7의배수만 출력한다. 
		  	단, 1000보다 크고 100의 자리가 7인 세번째 배수를 출력한다.	  	
		  	[정답]
		  		1715
		 */  
		int i=0;
		int count=0;
		while(true) {
			i++;
			if(i%7 ==0) {
				if(i>1000 && i%1000/100 == 7) {
					count++;
				}
			}
			if(count == 3) {
			System.out.println(i);
			break;
			}

		}
	}
}