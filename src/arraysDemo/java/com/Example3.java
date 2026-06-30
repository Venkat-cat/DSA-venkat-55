package arraysDemo.java.com;

import java.util.Arrays;

public class Example3 {
	public static void main(String[] args) {
		int arr[]= {1,0,3,0,2};
		int newarr[]=new int[arr.length];
		int j=0;
//		for(int i=0;i<arr.length;i++) {
//			
//			
//			if(arr[i]!=0) {
//				
//				newarr[j]=arr[i];
//				j++;
//			
//			}
//		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				continue;
			}
			newarr[j]=arr[i];
			j++;
		}
		System.out.println(Arrays.toString(newarr));
	}

}
