package com.yyh.ch09;

public class Control
{
	public int i;
    public int j;
	public void get(int i,int j)
		{
		this.i=i;
		this.j=j;
		if(j<=7){

        for( int a=1;a<=9-j;a++)
			{
	        System.out.print("  ");
             }
			 }
		for (int a=1;a<=9-i ;a++ )
		{
       
		
			System.out.print('\t');
            System.out.print("  ");
		}
	}
}