public class LetterCombinationPhoneNumber {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> list = new LinkedList<String>();
        if(digits.equals("")){
            return list;
        }
        String[] map = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        
        list.add("");
        for(int i=0;i<digits.length();i++){
            while(list.peek().length()==i){
                int index = Character.getNumericValue(digits.charAt(i));
                String s = list.remove();
                for(char c:map[index].toCharArray()){
                    list.add(s+c);
                }
            }
        }
        return list;
    }
}
