package day03;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// if문
		// 특정 조건을 만족할 때, 명령을 실행하고 싶은 경우 사용하는 문법
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 1을 입력하세요 : ");
		int number = sc.nextInt();
		
		//초기식; <- 조건을 세우기 위해 만들어줄 변수
		//if(조건식)
		//{
		//  조건식이 만족할 때 실행할 명령문;
		//}
		
		if(number == 1)
		{
			System.out.println("참 잘했어요!");
		}
		
		//if - else if
		//조건을 2개 이상 쓰고 싶을 경우, if 아래에 else if문을 설계합니다.
		//특징) if문을 2개 이상 적을 경우, 순서대로 조건을 확인하러 갑니다.
		//	   else if로 설계했을 경우에는 하나가 실행되면, 나머지는 실행되지 않습니다.
		//	   일반적으로는 if - else if - else를 통해 조건이 3개 이상되는 경우 자주 사용됩니다.
		//	   아래의 코드는 if - else로도 짤 수 있지만, 그렇다면 2가 아닌 값을 입력해도 x가 나오기 때문에
		//	   조건이 명확히 구분되는 경우라면 if - else if로 설계합니다.
		//주의사항) else나 else if는 if문의 보조문입니다. if가 있어야만 쓸 수 있습니다.
		
		//if(조건식)
		//{
		//  조건식이 만족할 때 실행할 명령문;
		//}
		//else if(조건식 2)
		//{
		//  위의 조건식이 만족하지 않은 상태에서, 조건식 2가 만족하는 경우 실행할 명령문;
		//}
		
		System.out.print("1. O 2. X : ");
		int choice = sc.nextInt();
		
		if(choice == 1)
		{
			System.out.println("O");
		}
		else if(choice == 2)
		{
			System.out.println("X");
		}
		
		//if - else
		//조건을 만족하는 경우를 if문에 설계하고, 만족하지 않는모는 경우를 else에 작성하는 문법
		//주로 정답이 Yes or No로 확정하는 경우라면 많이 사용됩니다.
		//단 조건이 아닌 모든 경우를 처리하기 때문에 어색할 수도 있습니다.
		//삼항 연산자로 대체하는 것도 가능합니다.
		
		sc.nextLine();
		
		System.out.print("당신은 매운걸 먹을 수 있나요? Y / N");
		char answer = sc.nextLine().charAt(0);
		
		if(answer == 'y' || answer == 'Y')
		{
			System.out.println("매운것을 잘 먹는다");
		}
		else
		{
			System.out.println("매운것을 못 먹는다");
		}
		
		sc.close();
	}

}