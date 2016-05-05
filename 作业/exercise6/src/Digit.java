package com.yyh.zuoye;

public class Digit
{   
	public void digit()
		{ 
		int count=0;
		for (int i=1;i<=4 ;i++ )
		{
			for (int j=1;j<=4 ;j++ )
			{
				for (int k=1;k<=4 ;k++ )
				{   
					if(i!=j&i!=k&j!=k){
					count++;
					System.out.print(+i);
					System.out.print(+j);
                    System.out.print(k+" ");
					}
					if(count%5==0)
					{System.out.println();}
				}
			}
		}
		System.out.println("总共个数为:"+count);
	}
	
}