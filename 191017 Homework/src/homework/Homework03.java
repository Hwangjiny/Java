package homework;

import java.util.Scanner;
public class Homework03 {

	public static void main(String[] args) {
		// 정수 값 10개를 입력 받기 위한 배열을 선언하고 각각의 배열 요소에 정수를 입력 받은 후 출력하는 프로그램을 작성하시요.
		int [] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 데이터 : ");
		arr[0] = sc.nextInt();
		System.out.print("두번째 데이터 : ");
		arr[1] = sc.nextInt();
		System.out.print("세번째 데이터 : ");
		arr[2] = sc.nextInt();
		System.out.print("네번째 데이터 : ");
		arr[3] = sc.nextInt();
		System.out.print("다섯번째 데이터 : ");
		arr[4] = sc.nextInt();
		System.out.print("여섯번째 데이터 : ");
		arr[5] = sc.nextInt();
		System.out.print("일곱번째 데이터 : ");
		arr[6] = sc.nextInt();
		System.out.print("여덟번째 데이터 : ");
		arr[7] = sc.nextInt();
		System.out.print("아홉번째 데이터 : ");
		arr[8] = sc.nextInt();
		System.out.print("열번째 데이터 : ");
		arr[9] = sc.nextInt();
		
		
		System.out.println("=====입력된 데이터 목록====\n");
		System.out.println("첫번째 데이터 : " + arr[0]);
		System.out.println("두번째 데이터 : " + arr[1]);
		System.out.println("세번째 데이터 : " + arr[2]);
		System.out.println("네번째 데이터 : " + arr[3]);
		System.out.println("다섯번째 데이터 : " + arr[4]);
		System.out.println("여섯번째 데이터 : " + arr[5]);
		System.out.println("일곱번째 데이터 : " + arr[6]);
		System.out.println("여덟번째 데이터 : " + arr[7]);
		System.out.println("아홉번째 데이터 : " + arr[8]);
		System.out.println("열번째 데이터 : " + arr[9]);
		
		
	}

}
