package extra;

public class BinSearch {
	public static void main (String args[]) {
		int[] arr = {-2,3,4,7,5,6,11,13,15};
		
		int target = 0;
		
		System.out.println("Found at position: "+search(arr, target));
	}
	
	static int search(int[] arr, int target) {
		
		int left = 0; 
		int right = arr.length -1;
		int mid =0; 
		
		while (left<=right) {
			mid = (left+right)/2;
			
			if(arr[mid] == target)
				return mid+1;
			else if (target<arr[mid])
				right = mid-1;
			else 
				left = mid +1;
		}
		return 0;
	}
}
