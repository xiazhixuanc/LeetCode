
public class FindDuplyNum_287 {
	public int findDuplicate(int[] nums) {
		if(nums == null || nums.length <= 1){
			return 0;
		}
		int m = nums.length;
		int slow = nums[0];
		int fast = nums[nums[0]];
		for(int i = 0; i < m; i++){
			slow = nums[slow];
			fast = nums[nums[fast]];
			if(slow == fast){
				slow = 0;
				while(slow != fast){
					slow = nums[slow];
					fast = nums[fast];
				}
				return slow;
			}
		}
		return 0;
	}
}
