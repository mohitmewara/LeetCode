class KSmallestNumber {
    public int findKthNumber(int m, int n, int k) {
     int start=1, end = n*m+1;
     while(start<end){
    	 int mid = start + (end-start)/2;
    	 int count = findNumber(mid, m,n);
    	 if(count >=k) end = mid;
    	 else if(count ==k){
    		 end = mid;
    		 break;
    	 }    		 
    	 else 
    		 start = mid+1;
     }
     
     return end;
    }
    
    public int findNumber(int mid, int m,int n){
    	int count=0;
    	for(int i=1;i<=m;i++){
    		count += Math.min(mid/i, n);
    	}
    	return count;
    }
}
