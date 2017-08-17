public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
		int result=0;
		int temp = x;
		for(;x!=0;x/=10){
			result = (result*10) + (x%10);
		}
		return (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) ? false : temp == result ? true :false;
        
    }
}
