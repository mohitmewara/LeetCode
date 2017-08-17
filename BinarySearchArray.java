
public class BinarySearchArray {

	public static void main(String[] args) {
		int arr[] = {0,0,0,0,0,0,0,0,0,1,1,1,1,1};
		System.out.println(binarySearch(0, arr.length-1, arr));
		
		
	}
	
	public static int binarySearch(int startIndex, int endIndex, int arr[]){
		if(endIndex< startIndex)
			return -1;
		
		int mid = (startIndex + endIndex)/2;
		
		if(arr[mid] ==0 && mid+1 <= endIndex && arr[mid+1] == 1)
			return mid+1;
		
		if(arr[mid] ==1 && mid-1 >= startIndex && arr[mid-1] == 0)
			return mid+1;
		
		if(arr[mid] ==1 && mid == startIndex)
			return mid;
		
		if(arr[mid] == 0)
			return binarySearch(mid+1, endIndex,arr);
		
		return binarySearch(startIndex, mid-1, arr);
	}
}
