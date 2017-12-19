import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IntersectionOfTwoArrays_349 {
	public int[] intersection(int[] nums1, int[] nums2) {
		if(nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0){
			return new int[]{};
		}
		Set<Integer> list = new HashSet<>();
		Map<Integer, Integer> table = new HashMap<>();
		for(int i = 0; i < nums1.length; i++){
			table.put(nums1[i], i);
		}
		for(int i = 0; i < nums2.length; i++){
			if(table.containsKey(nums2[i])){
				list.add(nums2[i]);
			}
		}
		int[] result = new int[list.size()];
		int i = 0;
		for(int num : list){
			result[i++] = num;
		}
		return result;
	}
}
