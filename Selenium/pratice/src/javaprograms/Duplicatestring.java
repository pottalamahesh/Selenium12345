package javaprograms;

public class Duplicatestring {

	public static void main(String[] args) {
		String str="mumbai";
		int count=0;
		char inp[]=str.toCharArray();
		System.out.println("duplicate charecters are");
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(inp[i]==inp[j])
				{
					System.out.println(inp[j]);
					count++;
					break;
				}
			}
		}
		
		
				
			
		

	}

}
