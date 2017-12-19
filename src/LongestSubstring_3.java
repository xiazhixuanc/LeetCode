import java.util.HashMap;
public class LongestSubstring_3 {
	    public int lengthOfLongestSubstring(String s) {
	        if(s == null || s.length() == 0){
	            return 0;
	        }
	        HashMap<Character, Integer> map = new HashMap<>();
	        int l = s.length();
	        int Max = 0;
	        int left = 0;
	        for(int right = 0; right < l; right++){
	            char c = s.charAt(right);
	            if(map.containsKey(c)){
	                left = Math.max(left, map.get(c)+1);
	            }
	            map.put(c, right);
	            Max = Math.max(Max, right-left+1);
	        }
	        return Max;
	    }
	}