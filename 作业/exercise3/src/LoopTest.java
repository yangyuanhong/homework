package com.yyh.ch09;

public class LoopTest
{
	public static void main(String[] args){
		long sum =1;
		for(int i=2;i<=10;i++){
		sum=sum*i;
		}
		System.out.println("1��10֮��������֮��Ϊ:"+sum);
		long sum1=1;
		int x=1;
		while(x<=10){
		sum1*=x;
		x++;
		}
		System.out.println("1��10֮��������֮��(while)Ϊ:"+sum1);
	}
}