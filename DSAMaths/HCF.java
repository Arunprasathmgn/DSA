package DSAMaths;

import java.util.Scanner;
public class HCF {
	// Find the HCF of two no's
	static int hcf(int num1,int num2) {
		int res=0;
		int min=num1>num2?num2:num1;
		for(int i=min;i>=1;i--) {
			if(num1%i==0 && num2%i==0)  {
				res=i;
				break;
			}}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first number to find the HCF :");
		int num1=sc.nextInt();
		System.out.println("Enter your Second number to find the HCF :");
		int num2=sc.nextInt();
		System.out.println("Here we go :"+hcf(num1,num2));
	}
}
