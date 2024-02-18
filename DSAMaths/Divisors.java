package DSAMaths;
import java.util.*;
public class Divisors {
	//Divisors of 20
	public static void main(String[] args) {
		int n=20;
		int k=1;
		TreeSet<Integer> ts=new TreeSet<>();
		for(int i=1;i*i<=n;i++) {
			if(n%i==0) {
				System.out.println("The Divisors are :"+i);
				ts.add(i);
				k=n/i;
				System.out.println("The Divisors are :"+k);
				ts.add(k);
			}
		}
         System.out.println("-----**********--------------***************------------");  

         for(int h :ts) {
        	 System.out.println("The Divisors in Asc order is :"+h);
         }
         
         
         




	}

}
