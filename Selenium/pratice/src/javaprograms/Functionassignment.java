package javaprograms;

public class Functionassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Functionassignment obj=new Functionassignment();
		int sum=obj.add(30, 40);
		System.out.println(sum);
		int sub1=obj.subtract(10, 30);
		System.out.println(sub1);
		int mul1=obj.multify(0, 0);
		System.out.println(mul1);
	int d5=	obj.division(10, 0 );
	System.out.println(d5);
	

	}
	
	public int add (int x,int y)
	{
		int c =x+y;
		return c;
	}
	public int subtract(int x,int y)
	{
		int z=x-y;
		
		if(x>y)
		{
			return z;
		}
		else
		{
			System.out.println("Invalid");
		}
		return z;
	}
	public int multify(int x,int y)
	{
		int a=x*y;
		return a;
	}
	public int division(int x,int y)
	{
		
		{
		int div1=x/y;
		if(x!=0)
		{
			return div1;
		}
		else if(x==0)
		{
			return 758;
			
		}
		else if(y==0)
		{
			return 123;
		}
		
	
		else
		{
		System.out.println();	
		}
		return div1;
	}
	}
}
	


