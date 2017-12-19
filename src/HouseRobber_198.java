
public class HouseRobber_198 {
	public int rob(int[] nums) {
		if(nums == null || nums.length == 0){
			return 0;
		}
		int prev = 0;
		int curr = nums[0];
		for(int i = 1; i < nums.length; i++){
			int temp = Math.max(prev, curr) ;
			curr = prev + nums[i];
			prev = temp;
		}
		return Math.max(prev, curr);
	}
}