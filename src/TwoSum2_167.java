
public class TwoSum2_167 {
	public int[] twoSum(int[] numbers, int target) {
		if(numbers == null || numbers.length == 0){
			return new int[]{0, 0};
		}
		int left = 0;
		int right = numbers.length-1;
		while(right > left){
			if(numbers[left] + numbers[right] == target){
				return new int[]{left+1, right+1};
			}
			if(numbers[left] + numbers[right] > target){
				right--;
			}
			if(numbers[left] + numbers[right] < target){
				left++;
			}
		}
		return new int[]{0, 0};
	}
}
