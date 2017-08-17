public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hash = new HashMap<Character,Integer>();
        char[] arr = s.toCharArray();
        int max=0;
        for(int i=0,j=0;j<arr.length;j++){
            if(hash.containsKey(arr[j])){
                i = Math.max(i,hash.get(arr[j])+1);
                hash.put(arr[j],j);
                max = Math.max(max, j-i+1);
            }else{
                hash.put(arr[j],j);
                max = Math.max(max, j-i+1);
            }
        }
        return max;
    }
}
