
public class BuyAndSell2_122 {
	    public int maxProfit(int[] prices) {
	        if(prices == null || prices.length == 0){
	            return 0;
	        }
	        int result = 0;
	        int temp = prices[0];
	        for(int i = 1; i < prices.length; i++){
	            if(prices[i] - temp > 0){
	                result += prices[i] - temp;
	                temp = prices[i];
	            }else{
	                temp = prices[i];
	            }
	        }
	        return result;
	    }
	}