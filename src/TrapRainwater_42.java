
public class TrapRainwater_42 {
	public int trap(int[] height) {
		int result = 0;
		int left = 0;
		int right = height.length-1;
		int maxRight = 0;
		int maxLeft = 0;
		while(left <= right){
			maxRight = Math.max(height[right], maxRight);
			maxLeft = Math.max(height[left], maxLeft);
			if(maxLeft < maxRight){
				result += maxLeft - height[left];
				left++;
			}
			else{
				result += maxRight - height[right];
				right--;
			}
		}
		return result;
	}
}