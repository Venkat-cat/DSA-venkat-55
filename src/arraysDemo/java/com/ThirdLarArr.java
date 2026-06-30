package arraysDemo.java.com;

public class ThirdLarArr {
	public static void main(String[] args) {
		int arr[] = {1,4,5,8,9,15};
		
		int first=0;
		int sec =0;
		int third=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]> first ) {
				third =sec;
				sec=first;
				first=arr[i];
			}
			else if(arr[i]>sec && arr[i]<first) {
				third =sec;
				sec =arr[i];
			}
			else if(arr[i]>third && arr[i] <sec) {
				third = arr[i];
			}
			
			
			
		}
		System.out.println(third);
		
	}

}
