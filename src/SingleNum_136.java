import java.util.HashSet;

public class SingleNum_136 {
	public int singleNumber(int[] nums) {
		HashSet<Integer> h = new HashSet<>();
		for(int i = 0; i < nums.length; i++){
			if(h.add(nums[i]) == false){
				h.remove(nums[i]);
			}
		}
		return h.iterator().next();
	}
}