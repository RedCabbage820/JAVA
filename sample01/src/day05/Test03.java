package day05;

public class Test03 {

	//함수 만드는 방법
	//1. public을 작성하면 외부에서 사용 가능
	//2. static을 작성하면 인스턴스 생성 없이 사용 가능
	//3. 반환할 자료형을 설정(int)
	//4. 함수의 이름 작성(abs)
	//5. 함수를 호출할 때, 값을 넣고 호출하는 경우라면 그 값을 받을 수 있는 변수를 작성합니다.(매개 변수)
	//6. 내부에 진행할 코드를 설계합니다.
	//7. void가 아니라면, return을 통해 함수를 종료시키고 return 다음에 적은 값을 전달합니다.
	
	public static int abs(int value)
	{
		//의사코드(pseudo code) : 코딩 전에 작성할 프로그램의 로직을 자연어를 통해 작성하는 코드
		//장점 : 프로그래밍 언어에 익숙하지 않아도 이해하기 쉬움
		//		작동 중의 오류 발생에 대한 해결에 큰 도움을 줌.
		//		바로 코딩을 진행하는 것에 비해 문제에 대한 명확한 사고가 가능해짐.
		
		//규칙 1) 한 줄에 하나의 동작만 작성한다.
		//		 if, else, while 같은 키워드를 활용한다.
		//		 들여쓰기를 활용한다.
		//		 동작을 명확하게 작성한다.
		
		//위의 abs 함수에 대한 의사 코드 작성
		//숫자 입력
		//if 숫자가 0보다 작음
		//	 숫자에 -1을 곱한 값을 return
		//else
		//	 숫자 그대로 return
		
		//의사 코드에 맞춰서 함수 구현
		//숫자 입력 -> 매개변수
		
		//if문을 적을 때, 실행시킬 명령문이 1개라면, {}을 생략할 수 있습니다.
		if(value < 0)
			return -value;
		else
			return value;
		
	}
	
	public static void main(String[] args) {
		
		//자바에서 자주 사용되는 함수들
		//특정 기능을 별도로 구현하지 않고, 그 함수를 호출하는 것으로 실행 결과를 얻을 수 있기 때문에
		//알아두면 코드 설계에 효과적입니다.
		
		//1) Absolute Number : 절댓값
		//Math.abs(값)을 통해 절대 값을 return 받을 수 있습니다.
		System.out.println(Math.abs(-10));
		System.out.println(Math.abs(10));
		System.out.println(Test03.abs(-10));
		System.out.println(Test03.abs(10));
		
		//2) Random Number : 랜덤값
		//0.0 ~ 1.0 사이의 임의의 double 형 데이터를 return하는 함수입니다.(1.0은 안나옴)
		//사용할 때 범위의 표현을 위해 숫자를 곱해줍니다.
		System.out.println((int)(Math.random()*10)); // 0 ~ 9 사이
		//0.0 ~ 1.0 -> 10을 곱함  0.0 ~ 10.0으로 범위가 잡히게 되고 그중에서 10은 포함 안되서 9까지
		
		//3) Minimum, Maximum Number : 최소, 최대 값
		System.out.println(Math.min(10, 4));
		System.out.println(Math.max(20, 40));
		
		//4) square root : 제곱근
		//주어진 값에 대한 제곱근을 계산해주는 함수
		System.out.println(Math.sqrt(4));
		
		//5. square : 제곱 (a의 b제곱)
		System.out.println(Math.pow(2,  3));
		
		//6. ceil : 올림
		System.out.println(Math.ceil(2.6));
		//7. floor : 내림
		System.out.println(Math.floor(2.6));
		//8. round : 반올림(결과를 정수로 변경)
		System.out.println(Math.ceil(2.6));
		
		//9. sin, cos, tan
		//삼각 함수 사인, 코사인, 탄젠트 값에 대한 결과를 계산해줍니다.
		
		//A,B,C를 삼각형의 각 꼭지점으로 두고
		//밑변이 b(AC), 높이가 a(BC), 빗변이 c(AB)라고 정의한다면
		//sin A = a/c
		//sin B = b/c
		//sin C = a/b
		
		//이 함수들의 공통적인 특징 : 각도(degree)가 아닌 라디안(radian)으로 계산
		
		//라디안 간단 요약 : 각도(degree)를 180으로 나누고 파이를 곱한 값
		
		//45도 계산
		double angle = 45;
		double radian = Math.toRadians(angle);
		System.out.println("각도가 45도인 삼각형의 sin값 : " + Math.sin(radian));
		System.out.println("각도가 45도인 삼각형의 cos값 : " + Math.cos(radian));
		System.out.println("각도가 45도인 삼각형의 tan값 : " + Math.tan(radian));
		
		//이런 계산 값이 왜 필요한가>
		//지도 등을 통해 특정 경로의 길이를 계산하는 상황 등에서 효과적이기 때문입니다.
	}
}