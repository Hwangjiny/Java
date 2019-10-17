package homework;

import java.util.Scanner;
public class Homework01 {

	public static void main(String[] args) {
	
	//원의 반지름으로 원의 넓이 구하

		Scanner sc = new Scanner(System.in);
		System.out.print("원의 반지름을 입력하시오. : ");
	    double rad = sc.nextDouble();
	    
	    double score = rad*rad*3.14;
	    System.out.println("원의 넓이 : " + score + "제곱센티미터 입니다.");
	   
	}

}
