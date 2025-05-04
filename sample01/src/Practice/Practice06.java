package Practice;

import java.util.Scanner;

//백준 알고리즘 10871번
//https://www.acmicpc.net/problem/10871

public class Practice06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		int[] A = new int[N];
		
		for(int i = 0; i < N; i++)
		{
			if(A[i] < X)
			{
				System.out.println(A[i] + " ");
			}
			sc.close();
		}
	}

}
