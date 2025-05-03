package day04;
//중첩 for문
//for문 안에 for문이 들어가는 구조
//2차원 배열 같이 데이터 안에 들어있는 구조 등을 작업 할 때 효과적입니다.

public class Test04 {

	public static void main(String[] args) {
		// 별 찍기 연습
		// 중첩 for문을 이용해서 행과 열을 설계하고, 특정 모양을 설계하고 화면에 출력하는 문제
		
		//1. 직각 삼각형
		//i : 행의 개수
		//j : 반복적으로 출력할 *의 개수
		for(int i = 1; i < 6; i++) // 1 ~ 5
		{
			for(int j = 0; j < i; j++) // j는 현재 행(i)의 개수만큼 출력이 되고 있음.
			{
				System.out.print("*");
			}
			System.out.println(); //별을 뽑을 때마다 띄어쓰기
		}
		
		//2. 직각 삼각형(역삼각형)
		for(int i = 1; i < 6; i++)
		{
			for(int j = 6; j > i; j--) //최대 수치에서 행의 수치만큼 감소
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//3. 직각 삼각형(반전)
		for(int i = 1; i < 6; i++)
		{
			
			for(int j = 5; j > 0; j--)
			{
				if(i < j)
				{
					//공백
					System.out.print(" ");
				}
				else
				{
					//*
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}