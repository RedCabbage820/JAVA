package Practice;

import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		// 사용자는 사용자의 나이를 입력합니다.
		// 나이가 성인일 경우 "인증되었습니다."를 출력합니다.
		// 나이가 성인이 아닐 경우 "인증에 실패했습니다."를 출력합니다.
		// 성인의 기준 19새 이상
		
		//강사님 풀이(변수 이름은 내가 만들었던 것으로 대체)
		/*
		 * Scanner sc = new Scanner(System.in); System.out.print("나이를 입력해주세요 : "); int
		 * age = sc.nextInt();
		 * 
		 * String result = age >= 19 ? "인증되었습니다" : "인증에 실패했습니다.";
		 * System.out.println(result);
		 */
		
		Scanner yu_age = new Scanner(System.in);
		int bA_age = 19;
		System.out.println("당신이 성인이라는 것을 인증하기 위해 나이를 입력하시오.(정수만 가능합니다.)");
		int your_age = yu_age.nextInt();
		
		if(your_age >= bA_age)
		{
			System.out.println("인증되었습니다.");
		}
		else if(your_age < bA_age)
		{
			System.out.println("인증에 실패했습니다.");
		}
		
		yu_age.close();
	}
}