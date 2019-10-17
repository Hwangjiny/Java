package homework;

import java.lang.reflect.Array;
import java.util.Scanner;
public class Homework04 {
	public static void main(String[] args) {
		/*배열을 이용하여 최대값을 구하는 문제
		사용자로부터 정수 5개를 입력받아 각각 배열에 대입하세요.
		해당 배열에서 최대값을 구해서 출력하세요.
		
		ex)
		1번째 값 입력 : 5
		2번째 값 입력 : 23
		3번째 값 입력 : 11
		4번째 값 입력 : 35
		5번째 값 입력 : 9
		최대값 : 35
		
		조건문 연산자 반복
		
		*/
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[5];
		
		for (int i = 0; i<5; i++) {
			System.out.print((i+1) + "번 째 값 입력 : ");
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i=0; i<4; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.println("====================");
		System.out.println();
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		

	}

}
