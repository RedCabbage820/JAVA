package day03;
//if - else처럼 둘 중 하나로 결론이 나는 작어을 할 때, 대신 사용할 수 있습니다.
//조건식 ? true일 경우의 값 : false일 경우의 값

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// 삼항 연산자
		int number = 7 > 1 ? 1 : 2;
		System.out.println(number);
		
		//위의 식을 if문 형태로 변형
		int number2 = 0;
		
		if(7 > 1)
		{
			number2 = 1;
		}
		else
		{
			number2 = 2;
		}
		System.out.println(number2);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 : ");
		int value = sc.nextInt();
		String result = (value > 0) ? "양수" : "양수가 아니다.";
		System.out.println(result);
		sc.close();
	}
}