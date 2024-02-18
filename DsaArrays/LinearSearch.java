package DsaArrays;

import java.util.Scanner;

public class LinearSearch {
	static int size,key;
	static int [] arr;
	static int linearSearch(int[] arr,int size,int key) {
		for(int i=0;i<size;i++) {
			if(arr[i]==key)
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
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
		System.out.println("Your key is present in :"+linearSearch(arr,size,key)+"  Position");
	}

}
