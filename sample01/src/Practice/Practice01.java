package Practice;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		//연습 문제 1. 정수를 입력하고, 해당 정수가 3과 5의 공배수인지 확인하는 프로그램을 구현하시오.
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요. : ");
		int number = sc.nextInt();
		
		//3의 배수이면서, 5의 배수인 값 == 3과 5의 공배수
		if(number % 3 == 0 && number % 5 == 0)
		{
			System.out.printf("정수 %d는 3과 5의 공배수입니다.\n", number);
		}
		else
		{
			System.out.printf("정수 %d는 3과 5의 공배수가 아닙니다.\n", number);
		}
		
		sc.close();

	}

}