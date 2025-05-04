package Practice;

import java.util.Scanner;

//백준 알고리즘 25304번
//https://www.acmicpc.net/problem/25304
public class Practice07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//1) 삼항 연산자
		int X = sc.nextInt();
		int N = sc.nextInt();
		int a,b;
		int total = 0;
		for(int i = 0; i < N; i++)
		{
			a = sc.nextInt();
			b = sc.nextInt();
			total += a*b;
		}
		String result = X == total ? "Yes" : "No";
		System.out.println(result);
		
		//2) if-else문 처리
		if(X == total)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		
		sc.close();
	}

}