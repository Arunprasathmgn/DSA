package DsaArrays;

import java.util.*;
import java.lang.Thread;
public class BSInbuildMethod {
	static int size,key;
	static int [] arr;
	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the size of an array :) ");
		size=sc.nextInt();
		arr=new int[size];
		System.out.println("Please enter the  a array  :) ");
		for(int k=0;k<size;k++) {
			arr[k]=sc.nextInt();
		}
		for(int l :arr) {
			System.out.print(l+" ");
		}
		System.out.println("                      ");
		System.out.println("Please enter the key of an array whatever you want :) ");
		key=sc.nextInt();
		int res= Arrays.binarySearch(arr,key);
		if(res<0){
			System.out.println("Element not found");  
		}else
			System.out.println("Your key is present in :"+res+" th Position");

	}
}

