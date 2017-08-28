class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subset = new ArrayList<List<Integer>>();
        for(int num: nums){
        	List<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();
            for(List<Integer> list: subset){
                temp.add(new ArrayList<Integer>(list));
            }
            
            for(ArrayList<Integer> list: temp){
                list.add(num);
            }
            
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(num);
            temp.add(list);            
            
            subset.addAll(temp);
        }
        subset.add(new ArrayList<Integer>());
        return subset;
    }
}
