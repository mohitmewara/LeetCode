
public class BestTimeStock {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length ==0)
            return 0;
            
        int left[] = new int[prices.length];
        int right[] = new int[prices.length];
        
        left[0]= prices[0];
        for(int i=1;i<prices.length;i++){
            if(left[i-1]>prices[i])
                left[i]=prices[i];
            else
                left[i]=left[i-1];
        }
        
        right[prices.length-1] = prices[prices.length-1];
        for(int i=prices.length-2;i>=0;i--){
            if(right[i+1]<prices[i])
                right[i] = prices[i];
            else
                right[i] = right[i+1];
        }
        int max=0;
        for(int i=0;i<prices.length;i++){
            int temp =right[i] - left[i];
            if(temp > max)
                max= right[i] - left[i];
        }
        return max;
    }
}
