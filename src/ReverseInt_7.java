
public class ReverseInt_7 {
	public int reverse(int x) {
		int result = 0;
		while(x != 0){
			int end = x % 10;
			int newResult = result * 10 + end;
			if((newResult - end) / 10 != result){
				return 0;
			}
			result = newResult;
			x /= 10;
		}
		return result;
	}
}