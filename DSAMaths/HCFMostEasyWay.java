package DSAMaths;

import java.util.Scanner;

public class HCFMostEasyWay {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first number to find the HCF :");
		int a=sc.nextInt();
		System.out.println("Enter your Second number to find the HCF :");
		int b=sc.nextInt();
		
		while(a!=0 && b!=0) {
			if(a>b)
				a=a%b;
			else
				b=b%a;
		}
		if(a!=0)
			System.out.println("Here we go :"+a);
		else
			System.out.println("Here we go :"+b);
		
		
		
		
		
		
	}

}
