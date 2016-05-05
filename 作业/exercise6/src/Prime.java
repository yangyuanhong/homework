package com.yyh.zuoye;

public class Prime
{
   public void prime()
	{  
	   int i=0;
	 int j=0;
	 int count=0; 
	 System.out.println("ËùÓĞËØÊı:");
	 for( i=101;i<=200;i++)
		{
		  for( j=2;j<i;j++)
		   {
		   if(i%j==0)
			   break;
		   }
		   if(j>=i)
		   {   
			   ++count;
			   System.out.printf("%d ",i);
		   if(count%5==0)
			   System.out.println();
		   }
			
	   }
		   
   }
}

