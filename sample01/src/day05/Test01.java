package day05;
//함수(메소드)
//하나의 기능을 수행하는 일련의 코드를 의미(명령문 집합체)
//사용자는 함수 호출을 통해 함수를 실행시키고, 그 결과를 얻을 수 있습니다.

//장점 : 한번 만들어둔 함수는 프로그램에 저장되어 원하는 호출 상황에 호출이 가능합니다.
//		이는 코드에 대한 재사용이 가능해져, 설계가 빠르게 진행됩니다.
//      함수로 특정 기능을 모아둔다면, 가독성도 높아집니다.
//      기능을 따로 설계했기 때문에 문제가 되는 부분을 빠르게 판단하고 수정이 가능합니다.(유지보수가 좋습니다.)

//단점 : 함수를 무분별하게 호출하게 되면, 그만큼의 시간이 소모되어 효율이 나빠질 수 있습니다.

//main 함수 : 자바에서 이 함수는 프로그램이 실행될 때 호출되는 함수이며, 프로그램의 실행 영역입니다.

public class Test01 {

	//1. static void 함수
	//void 함수는 함수를 실행하고 마무리되는 함수(별도로 전달해주는 값은 없습니다.
	public static void method01()
	{
		System.out.println("클래스 메소드01이 호출되었습니다.");
	}
	//2. static 자료형 함수
	//void 이외의 함수는 함수를 실행하고, return에 의해 값을 호출한 위치로 전달하는 함수(별도로 값이 전달됩니다.)
	public static int method02()
	{
		return 0;
	}
	//3. void 함수
	public void method03()
	{
		System.out.println("인스턴스 메소드 02이 호출되었습니다.");
	}
	//4. 자료형 함수
	public int method04()
	{
		return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. static 키워드가 붙은 함수(메소드)는 클래스 메소드라고 부릅니다.
		//호출할 때, 바로 사용이 가능합니다.
		method01();
		
		//2. 출력 문장에 출력할 데이터로 method02()를 호출합니다.
		//method02()에서 설계한 return 값이 해당 위치에 전달됩니다.
		System.out.println("클래스 메소드 02의 return 값 : " + method02());
		
		//3. static이 붙지 않은 함수를 인스턴스 메소드라고 부릅니다.
		//이 경우에는 해당 함수를 가지고 있는 클래스를 객체로써 생성한 뒤, 그 객체로부터 메소드를 불러와야 합니다.
		
		
		//인스턴스(instance)
		//클래스(class)를 가지고 생성된 결과물을 의미합니다.
		//인스턴스로 만들어진 값은 각각의 값이 서로 별개의 메모리 공간에 저장되게 됩니다.
		
		//인스턴스 만드는 방법
		//클래스명 인스턴스명 = new 클래스명();
		Test01 test01 = new Test01();
		Test01 test02 = new Test01();
		
		test01.method03();
		
		System.out.println("클래스 메소드 04의 값 : " + test01.method04());
		
		//클래스로 만들어진 각각의 인스턴스가 서로 다르다는 증거
		System.out.println(test01 == test02);
		System.out.println(test01.equals(test02));
		System.out.println(test01.hashCode());
		System.out.println(test02.hashCode());
	}

}