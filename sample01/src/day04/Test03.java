package day04;
//반복문 for
//for(1.초기식; 2.조건식; 4.증감식)
//{
//	3.조건이 만족하는 동안 실행할 명령문;
//}
//1. 초기식에 대한 처리가 진행됩니다(1회) ex) int a = 0;
//2. 초기식에 대한 처리가 진행됩니다 ex) int a < 10;
//2-1. 조건식의 결과가 성립하는 경우 ex) a = 0, a < 10 ? true
//	3. 명령문 실행
//	4. 증감식 실행
//2-2. 조건식의 결과가 성립하지 않는 경우
//	작업 종료

//continue : 해당 명령문 이후 작업을 중단하고, 다음 반복으로 넘어갑니다.
//break : 해당 명령문 이후 작업을 중단합니다.

public class Test03 {

	public static void main(String[] args) {
		// for, break, continue
		
		for(int i = 0; i < 10; i++)
		{
			System.out.print(i + " ");
		}
		//1. int i = 0; 실행
		//2. i < 10 ? 0 < 10 true
		//2-1. i출력
		//	   i++ 0 -> 1
		//이 작업을 i < 10가 만족하지 않을 때까지 반복하게 됩니다.
		//0 1 2 3 4 5 6 7 8 9
		System.out.println();
		
		System.out.println("continue test");
		//for문 안에서 만들어진 int i는 for문이 종료되면 삭제됩니다.
		//이름을 여러 개 고민할 필요가 없습니다.
		for(int i = 0; i < 10; i++)
		{
			if(i % 2 == 0) //2의 배수, 짝수의 조건
			{
				continue; //for문을 벗어나는게 아닌 for문의 마지막 작업 위치로 이동하는 코드에 가까움
			}
			System.out.println(i + " ");
		}
		
		//break와 continue는 다음과 같은 상황에 사용합니다.
		//break : 반복문에 대한 탈출
		//continue : 특정 조건에 대한 제외
	}

}