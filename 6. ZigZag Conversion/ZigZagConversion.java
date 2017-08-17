public class ZigZagConversion {
    public String convert(String s, int numRows) {
      char[] inputArr = s.toCharArray();
      
      StringBuffer[] sb = new StringBuffer[numRows];
      for(int i=0;i<numRows;i++) sb[i] = new StringBuffer();

      int index = 0;
      while (index < s.length())
      {
        for (int i = 0; i < numRows && index < s.length(); i++) sb[i].append(inputArr[index++]);
        for (int i = numRows - 2; i >= 1 && index < s.length(); i--) sb[i].append(inputArr[index++]);        
      }

      for (int i = 1; i < sb.length; i++) sb[0].append(sb[i]);

      return sb[0].toString();                
    }
}
