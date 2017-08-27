public class NonDecreasingArray {
public boolean checkPossibility(int[] nums) {
		int count =0;
		int index=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1])
                count++;
            if(count == 1){
                index =i;
                break;
            }
                
        }
        boolean flag=true;
        int temp=nums[index];
        if(count==1){
            if(index-1 < 0)
            	nums[index] = nums[index+1];
            else
            	nums[index] = nums[index-1];
            
            for(int i=0;i<nums.length-1;i++){
            	   	if(nums[i]>nums[i+1])
            	   		flag=false;
                }
                
            if(!flag){
            	nums[index] = temp;
            	if(index+1 <nums.length){
            		flag=true;
            		nums[index+1] = nums[index];
                    for(int i=0;i<nums.length-1;i++){
                	   	if(nums[i]>nums[i+1])
                	   		flag=false;
                    }            		
            	}
            }
         }       
         return flag;          
	}
}
