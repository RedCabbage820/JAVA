package Practice;

import java.util.Scanner;

//백준 알고리즘 10807번째 문제
//총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오
public class Practice05 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			for(int i = 0 ; i < N ; i++)
			{
				arr[i] = sc.nextInt();
			}
			int v = sc.nextInt();
			int count = 0;
			for(int i = 0; i < N; i++)
			{
				if(v == arr[i])
				{
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
