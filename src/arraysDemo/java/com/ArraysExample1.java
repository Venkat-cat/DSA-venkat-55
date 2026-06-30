package arraysDemo.java.com;
import java.util.Arrays;
import java.util.*;


public class ArraysExample1 {
	public static void main(String[] args) {
		int arr[] = {1,8,3,9,2,47};
		int position =3;
		int element=88;
//		arr[3]=88;
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//			
//		}
     	int arr1[] =new int [arr.length+1];
//		for(int i =0;i<arr.length;i++) {
//			arr1[i]=arr[i];
//			arr1[position]=element;
//			System.out.println(arr1[i]);
//			
//		}
     	for(int i=0;i<position;i++) {
     		arr1[i]=arr[i];
     	}
     	arr1[position]=element;
     	for(int i= position;i<arr.length;i++ ) {
     		arr1[i+1]=arr[i];
     	}
     	System.out.println("new array "+Arrays.toString(arr1));

		
	}

}
