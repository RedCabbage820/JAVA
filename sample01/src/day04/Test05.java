package day04;

//ArrayList
//특징) 같은 형태의 데이터를 여러 개 저장할 수 있습니다.
//	   일반적인 배열과 달리 추가, 제거 기능을 제공하고 있습니다.(크기 변형 가능)

import java.util.ArrayList;
import java.util.Arrays;

//장점 : 배열보다 쓰기 쉽고, 기능도 많이 제공해줌.
//단점 : 배열보다 데이터 용량이 큽니다.(배열보다는 느리다.)
//		데이터를 중간 위치에 삽입, 삭제하는 경우라면 빈 공간이 발생하지 않게
//		다른 값들을 옮기는 작업도 해야 하기 때문에 직업에서 성능이 부족하다.

//Array
//특징) 같은 형태의 데이터를 여러 개 저장할 수 있습니다.

//단점 : 만들고 난 뒤, 크기에 대한 수정이 불가능합니다.

public class Test05 {

	public static void main(String[] args) {
		//배열 만드는 방법
		//자료형[] 배열명 = new 자료형[배열의 길이];
		int[] iArray = new int[5];
		
		//배열 안에 데이터 넣는 방법
		//배열명[인덱스 번호] = 값;
		//인덱스 번호 = 0번부터 배열의 길이 -1까지 범위를 가진, 배열의 값을 접근하기 위한 고유한 값
		iArray[0] = 1;
		iArray[1] = 2;
		iArray[2] = 3;
		iArray[3] = 4;
		iArray[4] = 5;
		
		//Arrays.toString(배열명)은 배열 내부의 값을 문자 형태로 바꿔주는 문법
		System.out.println(Arrays.toString(iArray));
		
		//for문을 이용해 출력하는 방법
		for(int i = 0; i < 5; i++)
		{
			System.out.print(iArray[i] + " ");
		}
		
		System.out.println();
		//System.out.println(iArray[5]); //범위 이탈 시 오류 발생
		
		//foreach문을 이용해 출력
		//foreach문은 배열처럼 묶음이 있는 데이터 한정으로만 사용이 가능합니다.
		//for(자료형 변수명: 배열명)
		//{
		//	작업할 내용;
		//}
		
		for(int value : iArray) //배열 iArray 안에 있는 Value(int 형태의 데이터)의 개수만큼 반복
		{
			System.out.print(value + " ");
		}
		
		System.out.println();
		
		
		//ArrayList<타입> 리스트명 = new ArrayList<타입>();
		//단, ArrayList는 객체(클래스)의 형태로 작업을 진행하는 만큼
		//int, float같은 기본 자료형을 사용할 수 없습니다.
		
		//기본 자료형			래퍼 클래스(자료형을 객체로 만든 것)
		//int             -> Integer
		//flot            -> Float
		//double          -> Double
		//boolean         -> Boolean
		//char            -> Character
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		//1. 리스트명.add(값) : 리스트에 해당 값을 추가합니다.(순서대로 저장됩니다.)
		al.add(1);
		al.add(2);
		al.add(3);
		
		//2. 리스트명.remove(인덱스 번호) : 해당 인덱스 번호의 값을 리스트에서 제거합니다.
		al.remove(2);
		
		//3. 리스트명.set(인덱스번호, 값) : 해당 위치에 값을 저장하는 문법
		//							그 위치에 값이 있었다면 그 값은 제거되고 새 값이 들어갑니다.
		al.set(1, 57);
		
		//4. 리스트명.add(인덱스번호, 값) : 해당 위치에 값을 추가하는 문법
		al.add(1, 43);
		
		System.out.println("ArrayList의 크기 : " + al.size());
		
		System.out.println(al); //Arrays.toString()의 도움 없이 출력하면 바로 적용
		
		//리스트명.size()를 통해 현재 리스트의 전체 크기를 확인할 수 있습니다.
		for(int i = 0; i < al.size(); i++)
		{
			//배열[인덱스] 대신 리스트명.get(인덱스번호)로 값을 얻을 수 있습니다.
			System.out.print(al.get(i) + " ");
		}
		
		//5. 배열 전체 삭제
		al.clear();
		
		//6. isEmpty() : 해당 리스트가 비어있는지 아닌지를 판단하는 boolean
		if(al.isEmpty())
		{
			System.out.println("내용이 비어있습니다.");
		}
		else
		{
			for(Integer value : al)
			{
				System.out.print(value + " ");
			}
		}
	}
}