package day04;
//switch문
//if문과 비슷하게 처리되는 분기문

import java.util.Scanner;
//switch(변수)
//{
//case 값1 :
//	해당 값일 때 실행할 명령문;
//	break;
//case 값2 :
//	...
//default :
//	위의 값에 해당하지 않는 경우 실행할 명령문;
//}

//특정 조건보다는 값 하나하나로 결과를 볼 수 있는 형태의 설계라면 switch문을 사용하기에 적합합니다.
//if문 대신 사용할 수 있는 상황이라면, if문보다 전체를 보기가 편함(가독성이 좋은 편)
//상황에 맞는 코드로 전환하는 연습을 꼭 해볼 것 if -> switch, switch -> if

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int select;
		
		System.out.println("1.물 2.보리차 3.포카리스퀘어 4.파워헤이아치 5.산맥콜 6.오렌지주스");
		select = sc.nextInt();
		
		switch(select) //select의 값에 따라 명령을 따로 처리하겠습니다.
		{
		case 1 :
			System.out.println("주문한 물이 나왔다.");
			break; //break를 진행하면, 반복문이나 분기문을 탈출합니다.
		case 2 :
			System.out.println("주문한 보리차가 나왔다.");
			break;
		case 3 :
			System.out.println("주문한 포카리스퀘어가 나왔다.");
			break;
		case 4 :
			System.out.println("주문한 파워헤이아치가 나왔다.");
			break;
		case 5 :
			System.out.println("주문한 산맥콜이 나왔다.");
			break;
		case 6 :
			System.out.println("주문한 오렌지주스가 나왔다.");
			break;
		default :
			System.out.println("그딴 액체는 팔지 않는다. 프로그램을 제거한다.");
		}
	}

}