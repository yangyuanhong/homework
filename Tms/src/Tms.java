package com.yyh.Tms;

import java.util.Scanner;
public class Tms
{
	private Teacher[] tus=new Teacher[3];
	private int index;
  public Teacher[] queryAll()
	  {
	   Teacher[] demo =new Teacher[index];
	   System.arraycopy(tus,0,demo,0,index);
	   return demo;
  }
public void save(Teacher teacher){
		if(index >= tus.length){
			//数组的扩展
			Teacher[] demo = new Teacher[tus.length+3];
			System.arraycopy(tus,0,demo,0,index);
			tus = demo;
		}
		tus[index++] = teacher;
	}
	public Teacher queryById(long id)
	{
	int num=getIndexById(id);
    return num==-1?null:tus[num];

    
}
private int getIndexById(long id)
	{
	    int num=-1;
	for(int i=0;i<index;i++)
		{
		if(tus[i].getId()==id)
			{
			num=i;
			break;
		}	
	}
	return num;
}
public  void deleteById(long id)
	{
    int num=getIndexById(id);
	 for(int i=num;i<index-1;i++)
		{
         tus[i]=tus[i+1];
	 }
		 tus[--index]=null;
}
public void amendById(Teacher teacher)
	{
	for(int i=0;i<index;i++)
		{
		if(teacher.getId()==tus[i].getId())
			{
			tus[i].setName(teacher.getName());
			tus[i].setSeniority(teacher.getSeniority());
		}
	}

}

    public void menu()
		{
		System.out.println("********教师管理系统********");
        System.out.println("*1 查询教师的信息");
		System.out.println("*2 录入教师信息");
		System.out.println("*3 删除教师信息");
        System.out.println("*4 通过id查找教师信息");
        System.out.println("*5 修改教师信息");
		System.out.println("*exit 退出系统!");
	    System.out.println("*help 获取帮助");
	    System.out.println("********************************");
	}

	public static void main(String[] args)
	{
		Tms tms=new Tms();
		tms.menu();
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("*请输入对应指令");
		String num=sc.nextLine();
		switch(num){
			//查询
			case "1":
				System.out.println("以下是所有老师信息:");
			    Teacher[] tua=tms.queryAll();
				for(Teacher tu:tua)
					System.out.println(tu);
				System.out.println("总共查询到"+tms.index+"个老师");
			break;
			//录入
			case "2":
                while(true){
				    System.out.println("请输入要录入的老师【id#name#seniority】或者输入break返回上一级目录");
					String strtea=sc.nextLine();
					if(strtea.equals("break"))
						{
						break;
					}
                    String[] teaArr=strtea.split("#");
                    long id=Long.parseLong(teaArr[0]);
					String name=teaArr[1];
					int seniority=Integer.parseInt(teaArr[2]);
                    Teacher teas=new Teacher(id,name,seniority);
					tms.save(teas);
					System.out.println("保存成功!");
				}
			break;
			//删除
			case "3":
				while(true){
				    System.out.println("请输入您要删除的老师的id或者输入break返回上一级目录");
					String strid=sc.nextLine();
					if(strid.equals("break"))
						{
						break;}
						long id =Long.parseLong(strid);
						Teacher tea=tms.queryById(id);
						if(tea==null){
							System.out.println("您要删除的老师不存在!");
							continue;
							}
							tms.deleteById(id);
							System.out.println("删除成功!");}

			break;
			//通过id查找
			case "4":
				while(true){
				    System.out.println("请输入您要查询的老师的id或者输入break返回上一级目录");
					String strid=sc.nextLine();
					if(strid.equals("break"))
						{
						break;}
						long id=Long.parseLong(strid);
						Teacher tea=tms.queryById(id);
						System.out.println(tea==null?"Sorry1!not found":tea);
			}
			break;
			//修改
			case "5":
				while(true){
				System.out.println("请输入您要修改的老师的id或者输入break返回上一级目录");
			    String strid=sc.nextLine();
				if(strid.equals("break"))
					{
					break;}
					long id =Long.parseLong(strid);
					Teacher tea=tms.queryById(id);
						if(tea==null){
							System.out.println("您要删除的老师不存在!");
							continue;
							}
							System.out.println("原信息为:"+tea);
				System.out.println("输入新的信息:【name#senioritey】");
				String str=sc.nextLine();
				String[] teaArr=str.split("#");
				String name=teaArr[0];
				int senioritey=Integer.parseInt(teaArr[1]);
				Teacher newtea=new Teacher(id,name,senioritey);
				tms.amendById(newtea);
				System.out.println("修改成功!");
			} 
			break;
			case "exit":
            System.out.println("拜拜!欢迎下次使用!");
			System.exit(0);
			default:
			tms.menu();
			break;
		}

		}


	}
}