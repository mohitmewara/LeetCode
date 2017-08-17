import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Anagram {	
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        s.nextLong();
		
		String str = "bcda";
		long treeLen = 7;
		char[] charArr = str.toCharArray();
		Arrays.sort(charArr);
		TreeSet<String> tree= new TreeSet<String>();
		
		permute(tree, charArr, 0,treeLen,0);		
		
		for(String aa: tree)
			System.out.print(aa);
	}
	
	public static void permute(TreeSet<String> tree, char[] charArr, int start,long treeLen,long level){
		if(tree.size()>=treeLen && level==1)
			return;
		
		if(start == charArr.length-1){
			tree.add(prlongArr(charArr));			
			return;
		}
		
		for(int i=start;i<charArr.length;i++){
			swap(charArr, start,i);
			permute(tree, charArr, start+1,treeLen,level+1);
			swap(charArr, start,i);			
		}
		
	}
	
	public static String prlongArr(char[] charArr){
		StringBuffer aa = new StringBuffer();
		for(int i=0;i<charArr.length;i++)
			aa.append(charArr[i]);
		return aa.toString();
	}
	
	public static void swap(char[] charArr, int start, int end){
		char temp = charArr[start];
		charArr[start] = charArr[end];
		charArr[end] = temp;
	}
}
