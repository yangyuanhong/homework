package com.yyh.ch09;

public class Box1
{
	private int a;
    private int volume;
    private int area;
	public Box1()
		{
		System.out.println("�����޲ι��캯��");
		}
	public Box1(int a)
		{
		System.out.println("�����вι��캯��:");
		this.a=a;
		this.volume=a*a*a;
		this.area=a*a;
		}
		public void setA(int a)
			{
		this.a=a;
		}
	public int getA(){
			return this.a;
		}
	/**public void setVolume(int volume){
		this.volume=a*a*a;
		}*/
	public int getVolume(){
		    this.volume=a*a*a;
			return this.volume;
		}
    /**public void setArea(int area){
		this.area=a*a;
		}*/
	public int getArea(){
		    this.area=a*a;
			return this.area;
			}
		
public String toString(){
        return "box1[������߳�a:"+this.a+",���vloume:"+this.volume+",�����area:"+this.area+"]";
   }
}