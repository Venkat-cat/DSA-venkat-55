package arraysDemo.java.com;

public class MissingNum {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,8};
		int misval;
		for(int i=0;i<arr.length;i++) {
			if(arr[i+1]!=arr[i]+1) {
				misval=arr[i]+1;
				System.err.println(misval);
				return;
				
			}
			
			
			
		}
		
	}

}
