package javaprograms;

import java.util.ArrayList;

public class functions {

	public static void main(String[] args) {
		functions obj=new functions();
		obj.test();
		
		String s1=obj.getname();
		System.out.println(s1);
		int c1=obj.sum();
		System.out.println(c1);
	ArrayList<String>ar1=obj.getstudentnames();
	System.out.println(ar1);
	//System.out.println(obj.getstudentnames());
	int marks[]=obj.getmarks();
	for(int i=0;i<marks.length;i++)
	{
		System.out.println(marks[i]);
	}
		
	int d1=obj.division(10, 30);
	System.out.println(d1);
	String coun=obj.countryName("banlore");
	System.out.println(coun);

	}
	
//no ip no returns
	public void test()
	{
		System.out.println("selenium");
	}
	//noip but reteun value.
	public String getname()
	{
		System.out.println("get name");
		String x="testing";
				return x;
	}
	public  int sum()
	{
		System.out.println("sum method");
		int a=30;
		int b=40;
		int c=a+b;
		return c;
	}
	public ArrayList<String> getstudentnames()
	{
		System.out.println("get student names");
		ArrayList<String>ar=new ArrayList<String>();
		ar.add("mahesh");
		ar.add("ramesh");
		ar.add("srikanth");
		return ar;
		
	}
	public int[] getmarks()
	{
	int marks[]=new int[3];
	marks[0]=10;
	marks[1]=20;
	marks[2]=30;
	return marks;
	}
	//some ip div method
	public int division(int x,int y)
	{
		System.out.println("Division method");
		int div=y/x;
		return div;
	}
	public String countryName(String cityName)
	{
		System.out.println("get cityName");
		if(cityName.equals("banlore"))
		{
			return "India";
		}else if(cityName.equals("London"))
				{
			return "UK";
				}
		else if(cityName.equals("Newyork"))
		{
			return "USA";
		}
		else
		{
			return null;
		}
		
	}
		
		
		
		
		
		
	
}
