
public class ReverseString_344 {
	public String reverseString(String s) {
		char[] c = s.toCharArray();
		int j = c.length-1;
		for(int i = 0; i < j; i++){
			char temp = c[i];
			c[i] = c[j];
			c[j] = temp;
			j--;
		}
		return String.copyValueOf(c);
	}
}
