package arraysDemo.java.com;

import java.util.Arrays;

public class DeleleElement {
	public static void main(String[] args) {
		int arr[] ={7,9,2,6,1,5,3};
		int position =4;
		int newArr[] = new int[arr.length-1];
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(i==position) {
				continue;//condition true 
			}
			newArr[j]=arr[i];
			j++;
			
		}
		System.out.println(Arrays.toString(newArr));
	}

}
