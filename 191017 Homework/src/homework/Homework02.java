package homework;
import java.util.Scanner;
public class Homework02 {

	public static void main(String[] args) {
		
/*합계 구하기
키보드로 0 부터 999까지의 정수를 입력 받은 수 각각의 자릿수의 합한 결과를 출력하는 프로그램을 작 성하시오
1) 실행 결과
          
0~999까지의 정수입력 :456 15
0~999까지의 정수입력 :123 6
*/
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("0-999까지의 정수 입력 : ");
		int a = sc.nextInt();
		
		int h = a / 100;
		int t = (a % 100) / 10;
		int b = (a % 100) % 10;
		
		System.out.println(h +t +b);
	}

}
