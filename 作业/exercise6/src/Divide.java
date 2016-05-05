package com.yyh.zuoye;

import java.util.Scanner;
public class Divide
{
	public void Divide()
	{
		int sum=1;
		Scanner sc=new Scanner(System.in);
		int n=nextInt();
		for (int i=2;i<=n;i++ )
		{
			if(n/i==0)
			{
                sum*=i;
				System.out.println(n+"="+sum);
			}
		}

	}

}