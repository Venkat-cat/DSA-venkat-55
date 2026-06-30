package arraysDemo.java.com;
import java.util.Arrays;

public class ArraysExample2 {
	public static void updateElement(int arr[],int size,int position ,int newVal) {
		if(position<0|| position>size) {
			System.out.println("in valid postion");
		}
		else {
			arr[position ]=newVal;
			System.out.println("updated data :"+position +" "+newVal);
		}
		
	}
	
		
	
	public static void main(String[] args) {
		int arr[] = {1,24,4,6,7};
		ArraysExample2.updateElement(arr,arr.length,3,77);
		System.out.println(Arrays.toString(arr));
		
	}

}
