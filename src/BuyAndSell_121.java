
public class BuyAndSell_121 {
	public int maxProfit(int[] prices) {
		if(prices == null || prices.length == 0){
			return 0;
		}
		int result = 0;
		int min = prices[0];
		for(int i = 1; i < prices.length; i++){
			min = Math.min(prices[i], min);
			result = Math.max(result, prices[i] - min);
		}
		return result;
	}
}