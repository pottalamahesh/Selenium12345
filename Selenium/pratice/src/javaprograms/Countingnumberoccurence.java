package javaprograms;

public class Countingnumberoccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="raj";
		int count=0;
		for(int i=0;i<str.length()-1;i++)
		{
			char c1=str.charAt(i);
			for(int j=0;j<str.length();j++)
			{
			if(str.charAt(i)==str.charAt(j))	
			{
				count=count+1;
			}
			}
			
			System.out.println(str.charAt(i)+" "+count);
			count=0;
		}
	}

}
