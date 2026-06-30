package arraysDemo.java.com;

public class ArrayPractice4 {
	public static void main(String[] args) {
		int arr[]= {4,4,5,6,4,3,5,4,1,4,1};
		int left=1;
		int right =arr.length;
		int value;
	
		int mid=(left+right)/2;
		for(int i=0;i<arr.length-1;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
			if(arr[i]==arr[j]){
				count++;
			}
				if(count>=arr.length/2) {
					value=arr[i];
					System.out.println("reapeated max element :"+value);
					
			
					
					
				
				
				
			}
			
		}
		
			
		}
	
		
	}

}
