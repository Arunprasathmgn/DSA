package DSAMaths;
import java.util.*;
public class HCFEasyWay {
	// Find the HCF of two no's in easy way
	static int hcf(int a,int b) {
		while(a!=b) {
			if(a>b) 
				a=a-b;
			else
				b=b-a;
		}
		return a;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first number to find the HCF :");
		int a=sc.nextInt();
		System.out.println("Enter your Second number to find the HCF :");
		int b=sc.nextInt();
		System.out.println("Here we go :"+hcf(a,b));

	}

}
