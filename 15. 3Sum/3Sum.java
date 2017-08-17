public class 3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> l = null;
        for(int i=0;i<nums.length-2;i++){
            if (i == 0 || (i > 0 && nums[i] != nums[i-1])) {
            int start =i+1;
            int end = nums.length-1;
            while(start<end){
//                System.out.println("aa");
                if(nums[i] + nums[start] + nums[end] == 0){
                    l = new ArrayList<Integer>();
                    l.add(nums[i]);
                    l.add(nums[start]);
                    l.add(nums[end]);
                    list.add(l);
                    while(start<end){if(nums[start] == nums[start+1]){start++;}else{break;}}
                    while(start<end){if(nums[end] == nums[end-1]){end--;}else{break;}}
                    start++;
                    end--;
                }else if(nums[i] + nums[start] + nums[end] < 0){
                    start++;
                }else{
                    end--;
                }
            }
        }
        }
        return list;
    }
}
