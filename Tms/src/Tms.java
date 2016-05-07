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
			//�������չ
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
		System.out.println("********��ʦ����ϵͳ********");
        System.out.println("*1 ��ѯ��ʦ����Ϣ");
		System.out.println("*2 ¼���ʦ��Ϣ");
		System.out.println("*3 ɾ����ʦ��Ϣ");
        System.out.println("*4 ͨ��id���ҽ�ʦ��Ϣ");
        System.out.println("*5 �޸Ľ�ʦ��Ϣ");
		System.out.println("*exit �˳�ϵͳ!");
	    System.out.println("*help ��ȡ����");
	    System.out.println("********************************");
	}

	public static void main(String[] args)
	{
		Tms tms=new Tms();
		tms.menu();
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("*�������Ӧָ��");
		String num=sc.nextLine();
		switch(num){
			//��ѯ
			case "1":
				System.out.println("������������ʦ��Ϣ:");
			    Teacher[] tua=tms.queryAll();
				for(Teacher tu:tua)
					System.out.println(tu);
				System.out.println("�ܹ���ѯ��"+tms.index+"����ʦ");
			break;
			//¼��
			case "2":
                while(true){
				    System.out.println("������Ҫ¼�����ʦ��id#name#seniority����������break������һ��Ŀ¼");
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
					System.out.println("����ɹ�!");
				}
			break;
			//ɾ��
			case "3":
				while(true){
				    System.out.println("��������Ҫɾ������ʦ��id��������break������һ��Ŀ¼");
					String strid=sc.nextLine();
					if(strid.equals("break"))
						{
						break;}
						long id =Long.parseLong(strid);
						Teacher tea=tms.queryById(id);
						if(tea==null){
							System.out.println("��Ҫɾ������ʦ������!");
							continue;
							}
							tms.deleteById(id);
							System.out.println("ɾ���ɹ�!");}

			break;
			//ͨ��id����
			case "4":
				while(true){
				    System.out.println("��������Ҫ��ѯ����ʦ��id��������break������һ��Ŀ¼");
					String strid=sc.nextLine();
					if(strid.equals("break"))
						{
						break;}
						long id=Long.parseLong(strid);
						Teacher tea=tms.queryById(id);
						System.out.println(tea==null?"Sorry1!not found":tea);
			}
			break;
			//�޸�
			case "5":
				while(true){
				System.out.println("��������Ҫ�޸ĵ���ʦ��id��������break������һ��Ŀ¼");
			    String strid=sc.nextLine();
				if(strid.equals("break"))
					{
					break;}
					long id =Long.parseLong(strid);
					Teacher tea=tms.queryById(id);
						if(tea==null){
							System.out.println("��Ҫɾ������ʦ������!");
							continue;
							}
							System.out.println("ԭ��ϢΪ:"+tea);
				System.out.println("�����µ���Ϣ:��name#senioritey��");
				String str=sc.nextLine();
				String[] teaArr=str.split("#");
				String name=teaArr[0];
				int senioritey=Integer.parseInt(teaArr[1]);
				Teacher newtea=new Teacher(id,name,senioritey);
				tms.amendById(newtea);
				System.out.println("�޸ĳɹ�!");
			} 
			break;
			case "exit":
            System.out.println("�ݰ�!��ӭ�´�ʹ��!");
			System.exit(0);
			default:
			tms.menu();
			break;
		}

		}


	}
}