
public class ExcelNumber_171 {
	public int titleToNumber(String s) {
		int result = 0;
		for(int i = 0; i < s.length(); i++){
			result = s.charAt(i) - 'A' + 1 + 26 * result;
		}
		return result;
	}
}