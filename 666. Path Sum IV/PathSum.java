class PathSum {
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    public int pathSum(int[] nums) {        
    	for(int num:nums){
    		int key = num/10;
    		int value = num%10;
    		map.put(key, value);
    	}
        
    	return recurse(nums[0]/10,0,0);
    }
    
    public int recurse(int root, int sum, int path){
    	if(!map.containsKey(root))
    		return sum;
    	int level= root/10;
    	int position = root%10;
    	path += map.get(root);
    	int child1 = (level + 1)*10 + (2*position -1);
    	int child2 = (level + 1)*10 + (2*position);
    	if(!map.containsKey(child1) && !map.containsKey(child2)){
    		sum += path;
    		return sum;
    	}   		
    	
    	sum = recurse(child1, sum, path);
    	sum = recurse(child2, sum, path);
    	
    	return sum;
    }
}
