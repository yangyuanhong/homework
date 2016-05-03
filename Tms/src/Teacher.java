package com.yyh.tms;

public class Teacher
{
	private long id;
	private String name;
	private int seniority;
	public Teacher(){};
	public  Teacher(long id,String name,int seniority){
	this.id=id;
	this.name=name;
	this.seniority=seniority;
	}
	
	public void setId(long id){
		this.id=id;}
	public long getId(){
			return this.id;
		}
	public void setName(String name){
		this.name=name;}
	public String getName(){
			return this.name;
		}
    public void setSeniority(int seniority){
		this.seniority=seniority;}
	public int getSeniority(){
			return this.seniority;}
   public String toString(){
        return "teacher[id:"+this.id+",name:"+this.name+",seniority:"+this.seniority+"]";
   }

}