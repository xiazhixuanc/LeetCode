import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {
	public int[] twoSum(int[] nums, int target){
		if(nums == null || nums.length < 2){
			return new int [] {-1, -1};
		}
		Map<Integer, Integer> hash = new HashMap<>();
		for(int i = 0; i < nums.length; i++){
			if(hash.containsKey(target - nums[i]) )
				return new int [] {i, hash.get(target - nums[i])};
			hash.put(nums[i], i);
		}
		return new int [] {-1, -1};
	}

}
