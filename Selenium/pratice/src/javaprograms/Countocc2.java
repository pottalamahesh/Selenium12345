package javaprograms;

import java.util.Scanner;

public class Countocc2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str;
		char ch;
		int count=0;
		System.out.println("enter a String");
		str=s.nextLine();
		while(str.length()>0)
		{
			ch=str.charAt(0);
			int i=0;
			while(str.charAt(i)==ch)
			{
				count=count+i;
				i++;
			}
		
		
			str.substring(count);
			System.out.println(ch);
		}
			System.out.println(count);
			
		}
	}
	
		




