package arraysDemo.java.com;

import java.util.Arrays;

public class ArrayDemo4 {
	public static void main(String[] args) {
		int arr[]= {1,1,2,2,3,3,4};
		int count=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				count++;
				
			}
			
		}
		int arr1[]=new int[arr.length-count];
		int j=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				
			
				arr1[j]=arr[i];
				j++;
			}
			
		}
		arr1[j]=arr[arr.length-1];//store last index value;
		System.out.println(Arrays.toString(arr1));
		
		
	
}

}
