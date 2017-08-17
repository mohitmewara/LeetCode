public class ReverseInteger {
    public int reverse(int x) {
		String str= x+"";
		StringBuffer st = new StringBuffer();
		int start=0;
		if(x<0){
			start=1;
			st.append("-");
		}
		
		for(int i=str.length()-1; i>=start; i--){
			st.append(str.charAt(i));
		}
		int aaa=0;
		try{
			aaa=Integer.parseInt(st.toString());
//			System.out.println(aaa);
		}catch (Exception e) {
//			e.printStackTrace();
			return 0;
		}
		return aaa;
    }
}
