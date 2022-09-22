package studio3;

import java.util.Scanner;
public class Sieve {


	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n= in.nextInt();
		boolean[] sieve = new boolean[n+1];
		for (int i=0; i<(n+1); i++)
		{
			sieve[i]=true;
		}
		for (int i=2; i<Math.sqrt(n); i++)
		{
			if (sieve[i]=true)
			{
				for(int j=(int)Math.pow(i, 2); j<n+1; j=j+i)
				{
					sieve[j]=false;
				}

			}

		}
		for (int i=0; i<n+1; i++)
		{
			System.out.println(sieve[i]);
		}
	}

}
