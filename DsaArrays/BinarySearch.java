package DsaArrays;

import java.util.Scanner;

public class BinarySearch {
	static int size,key;
	static int [] arr;
	static int BinarySearch(int[] arr,int size,int key) {
		int l=0;
		int h=size-1;
		int mid=0;

		while(l<=h){
			mid=(l+h)/2;
			if(key==arr[mid]){
				return mid;
			}
			else if(key<arr[mid]){
				h=mid-1;
			}
			else{
				l=mid+1;
			} }
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
		System.out.println("Your key is present in :"+BinarySearch(arr,size,key)+"  Position");
	}

}
