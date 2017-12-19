
public class MaximumSubArray_53 {
	public int maxSubArray(int[] nums) {
		if(nums == null || nums.length == 0){
			return 0;
		}
		int temp = nums[0];
		int result =  nums[0];
		for(int i = 1; i < nums.length; i++){
			int v = temp + nums[i];
			temp = Math.max(nums[i], v);
			result = Math.max(temp, result);
		}
		return result;
	}		
}
