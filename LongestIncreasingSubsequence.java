import java.util.Vector;

public class LongestIncreasingSubsequence {

	static int GetCeilIndex(int arr[], int[] tailIndices, int l, int r,	int key)
	{
		while (r - l > 1)
		{
			int m = l + (r - l)/2;
			if (arr[tailIndices[m]] >= key)
				r = m;
			else
				l = m;
		}
		
		return r;
	}

	static int LongestIncreasingSubsequence(int arr[], int n)
	{
	// Add boundary case, when array n is zero
	// Depend on smart pointers
	
		int[] tailIndices = new int[n];		
		tailIndices[0]=0;
		
		int[] prevIndices = new int[n];		
		prevIndices[0]=-1;
	
		int len = 1; // it will always point to empty location
		for (int i = 1; i < n; i++)
		{
			if (arr[i] < arr[tailIndices[0]])
			{
				// new smallest value
				tailIndices[0] = i;
				prevIndices[i] = -1;
			}
			else if (arr[i] > arr[tailIndices[len-1]])
			{			
				prevIndices[i] = tailIndices[len-1];
				tailIndices[len++] = i;				
			}
			else
			{
				int pos = GetCeilIndex(arr, tailIndices, -1, len-1, arr[i]);
		
				prevIndices[i] = tailIndices[pos-1];
				tailIndices[pos] =i;
			}
		}
	
		System.out.println("LIS of given input");
	
		for (int i = tailIndices[len-1]; i >= 0; i = prevIndices[i])
			System.out.print(arr[i] +" ");
		System.out.println();
	
	return len;
	}

	public static void main(String[] args) 
	{
		int arr[] = { 7, 11, 8, 10, 13, 6,1,2 };
		
		System.out.println("LIS size \n" + LongestIncreasingSubsequence(arr, arr.length));
			
	}	
	
	
}



