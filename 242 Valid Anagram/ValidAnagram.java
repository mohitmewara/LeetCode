class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] arr = new int[26];
        
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        for(char c : sArr)
            arr[c - 'a'] += 1;
        
        for(char c : tArr)
            arr[c - 'a'] -= 1;
        
        for(int i : arr){
            if(i != 0)
                return false;
        }
        return true;
    }
}
