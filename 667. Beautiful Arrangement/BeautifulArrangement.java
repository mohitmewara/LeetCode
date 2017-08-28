class BeautifulArrangement {
    public int[] constructArray(int n, int k) {
    	int[] arr = new int[n];
    	
    	for(int index=0,left=1,right=n;left<=right;index++){
    		arr[index] = k > 1 ? (k-- %2 != 0 ? left++ : right--) : left++;
    	}
    	
    	return arr;  
    }
}
