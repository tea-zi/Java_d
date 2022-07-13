package D4_반본문4_프로젝트;

import java.util.Scanner;

public class 반복문4_프로젝트_KEY {
	/*
	 * [키위치 찾기]
	 * 
	 * 1. -1이 나올 때까지 일련의 수를 입력받는다.
	 * 2. 위 수 중 key 값이 몇 번째에 포함되어 있는가를 출력하는 프로그램을 작성하시오.
	 * 3. 단, key가 여러개 포함되어 있을 경우 앞에 나타난 것의 위치를 출력하시오.
	 * 4. key가 일련의 수 안에 없는 경우 "not found"를 출력하시오.
	 * 
	 * 예) 
	 * result 값 입력 : 99
	 * 
	 * 입력 : 10
	 * 입력 : 99
	 * 입력 : 20
	 * 입력 : 99
	 * 입력 : 30
	 * 입력 : 99
	 * 입력 : 10
	 * 입력 : -1
	 * 
	 * 결과 : key값 99가 첫번재 나타난 것은 2번째 이다.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        int result = 99;
                // 경우의 수 ==> -1 ==> "not found"
        // 경우의 수 ==> 99, 77, -1 ==> 키는 1번이다. 
        // 경우의 수 ==> 55, 99, 99, 99, 99, 3, -1 ==> 키는 2번이다.
        
        int c1 = 1;
        int c2 = 0;
        int n = 0;
        while(true) {
        	System.out.print("key값 입력 : ");
        	int key = scan.nextInt();
        	if(key == result) {
        		c2++;
        		if(c2 == 1) {
        			n = c1;
        		}
        	}
        	if(key == -1) {
        		break;
        	}
        	c1++;
        }
        if(c2 == 0) {
        	System.out.println("not found");
        }
        else {
        System.out.println("키 위치 : " + n);
        }
        
        int number = 0;
        int i = 1;
        boolean check = false;
        while(true) {
        	System.out.print("key값 입력 : ");
    		int key = scan.nextInt();
    		if(key == -1) {
    			break;
    		}else if(key == result && check == false) {
    			check = true;
    			number = i;
    		}
    		i += 1;
        }
        
        if(check == false) {
        	System.out.println("not found");
        }else {
        	System.out.println(number);
        }
	}

}