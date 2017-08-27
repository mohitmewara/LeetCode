import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
	public static void main(String[] args) {
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		
		HashMap<String, List<String>> map = new HashMap<String, List<String>>();
		for(String str : strs){
			char[] charArr = str.toCharArray();
			Arrays.sort(charArr);
			String word = new String(charArr);
			if(map.containsKey(word)){
				map.get(word).add(str);
			}
			else{
				List<String> list = new ArrayList<String>();
				list.add(str);
				map.put(word, list);
			}
		}
		List<List<String>> returnList = new ArrayList<List<String>>();
		for(List<String> list : map.values()){
			returnList.add(list);
		}
		
//		return returnList;
	}
}
