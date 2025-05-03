package day04;
//while문


//1. 일반 while문
//조건이 만족하고 있다면, 계속 내부의 명령문을 반복시킨다.
//명령문 1회 반복을 루프(loop)라고 부르겠습니다.
//의도되 것이 아니라면, 조건을 탈출시킬 명령문을 넣어서 루프(loop)를 제어해야 합니다.
//while(조건문)
//{
//	조건이 만족하는 동안 실행할 명령문;
//	조건을 탈출하기 위한 명령문; <-- 해당 부분의 작성이 안됬을 경우 무한 루프 발생
//}

//2. while true문
//조건이 항상 일치(true)하는 while문으로, 계속 반복하게 됩니다.
//break나 continue 같은 반복 탈출 명령문을 통해 중단 시킬 수 있습니다.
//위의 일반 while문과 달리 조건이 따로 설정된게 없어서, 내부에서 if문 등을 통해 조건을 세우기도 합니다.
//while(true)
//{
//	조건이 만족하는 동안 실행할 명령문;
//}

//3. do while문
//do 영역에 설계할 명령문을 1회 시작한 뒤, while문 조건에 따라 반복을 진행하는 명령문
//무조건 1회는 실행이 보장되어야 하는 경우 사용하는 문법

//do
//{
//	실행할 명령문; //이 명령은 조건과 상관없이 1회는 실행됩니다.
//}
//while(조건식)
public class Test02 {

	public static void main(String[] args) {
		
		int sum = 0; //숫자의 합
		int i = 1; //초기 값(조건을 세우기 위해 필요한 값)
		System.out.println("작업 시작");
		//i가 10보다 작을 동아 작업을 반복합니다.
		while(i < 10)
		{
			//숫자의 합에 현재의 값을 더해줍니다.
			sum += i;
			System.out.println("현재 i의 값" + i);
			//i의 값을 1 증가시킵니다.(조건을 탈출하기 위한 식)
			i++;
			System.out.println("현재 숫자의 합 : " + sum);
			System.out.println("다음 계산할 i : " + i);
		}
		System.out.println("작업 종료");
	}

}