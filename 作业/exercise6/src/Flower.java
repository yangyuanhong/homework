package com.yyh.zuoye;

public class Flower 
{  
	public void flower()
	{   int i=0;
		for ( i=100;i<=999 ;i++ )
		{   
			int a=0;
			int b=0;
			int	c=0;
			int s=0;
			a=i/100;
			b=(i%100)/10;
			c=i%10;
			s=a*a*a+b*b*b+c*c*c;
			if(s==i)
			{
				System.out.print(i+" ");
			}
         
		}
	}
}