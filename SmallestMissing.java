
public class SmallestMissing {
	int findFirstMissing(int array[], int start, int end) 
	{
		if (start > end)
			return end + 1;

		if (array[0]+start != array[start])
			return array[0]+start;

		int mid = (start + end) / 2;

		// Left half has all elements from 0 to mid
		if (array[mid] == array[0]+mid)
			return findFirstMissing(array, mid+1, end);

		return findFirstMissing(array, start, mid);
	}

	// Driver program to test the above function
	public static void main(String[] args) 
	{
		SmallestMissing small = new SmallestMissing();
		int arr[] = {4, 5, 6, 7, 10};
		int n = arr.length;
		System.out.println("First Missing element is : "
				+ small.findFirstMissing(arr, 0, n - 1));	
		
		
		int arr1[] = {12, 1, 78, 90, 57, 89, 56};
		int k=3;
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<k;i++){
			max = Math.max(max, arr1[i]);
		}
		System.out.println(max);
		
		int end=k-1;
		
		for(int i=0;i<arr1.length-k;i++){
			max = Math.max(max, arr1[++end]);			
			System.out.println(max);
		}		
		
	}
}
