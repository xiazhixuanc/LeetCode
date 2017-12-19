
public class CountAndSay_38 {
	public String countAndSay(int n){
		if(n <= 0){
			return null;
		}	
		String s = "1";
		StringBuilder sb = new StringBuilder();
		sb.append("1");
		int count = 0;
		for(int i = 1; i < n; i++){
			s = sb.toString();
			sb.setLength(0);
			count = 1;
			char c = s.charAt(0);
			for(int j = 1; j < s.length(); j++){
				if(s.charAt(j) == c){
					count++;
				}
				else{
					sb.append(count);
					sb.append(c);
					c = s.charAt(j);
					count = 1;
				}
			}
			sb.append(count);
			sb.append(c);
		}
	    return sb.toString();
	}
}
