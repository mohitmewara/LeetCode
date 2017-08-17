public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length ==0){
            return new int[0];
        }
        int[] arr = new int[nums.length-k+1];
        int a=0;
        Deque<Integer> dequeue = new LinkedList<Integer>();
        int i=0;
        for(;i<k;i++){
            while(!dequeue.isEmpty() && nums[i] > nums[dequeue.getLast()]){
                dequeue.removeLast();
            }
            dequeue.add(i);
        }
        
        for(;i<nums.length;i++){
            arr[a] = nums[dequeue.getFirst()];
            a++;
            while(!dequeue.isEmpty() && dequeue.getFirst() <=i-k){
                dequeue.removeFirst();
            }
            
            while(!dequeue.isEmpty() && nums[i] > nums[dequeue.getLast()]){
                dequeue.removeLast();
            }
            dequeue.add(i);            
        }
        arr[a] = nums[dequeue.getFirst()];
        return arr;
    }
}
