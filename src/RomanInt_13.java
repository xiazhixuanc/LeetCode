public class RomanInt_13 {
	public int romanToInt(String s) {
		if(s.length() == 0){
			return 0;
		}
		int result = 0;
		for(int i = 0; i < s.length()-1; i++){
			if(getInt(s.charAt(i)) < getInt(s.charAt(i+1))){
				result -= 2 * getInt(s.charAt(i));
			}
			result += getInt(s.charAt(i));
		}
		return result + getInt(s.charAt(s.length()-1));
	}


	public int getInt(char c){
		switch(c){
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		}  
		return -1;
	}
}