package 테스트04_06_문제;

public class 반복문04 {
	public static void main(String[] args) {
		/*		 
	  	반복문을 사용해 7의배수만 출력한다. 
	  	단, 1000보다 크고 100의 자리가 7이고 일의 자리가 3인 배수를 다섯개를 작은수부터 순서대로 출력한다.	  	
	  	1743
		2723
		2793
		3703
		3773
	 */
		int i=0;
		int count = 0;
		while(true) {
			i++;
			if(i%7 == 0) {
				if(i>1000 && i%1000/100 == 7 && i%10 == 3) {
					count++;
					System.out.print(i + " ");
					System.out.println(i%7);
				}
			}
			if(count == 5) {
				break;
			}
		}
	}
}