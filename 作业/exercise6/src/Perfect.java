package com.yyh.zuoye;

public class Perfect 
{
	public void perfect()
	{   
	     int i=0;
		 int j=0;
		for ( i=1;i<=1000 ;i++ )
		{
			int sum=0;
			for ( j=1;j<i ;j++ )
			{
				
				if(i%j==0)
				{
                 sum+=j;
				}
			}
			if(sum==i)
			{   
		     	System.out.print(i+" ");
			}	
		}

	}
}