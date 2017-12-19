
public class ExcelTitle_168 {
	    public String convertToTitle(int n) {
	        String result = "";
	        StringBuilder sb = new StringBuilder();
	        while(n != 0){
	            n--;
	            char c = (char)( n % 26 + 'A' );
	            sb.insert(0, c);
	            n /= 26;
	        }
	        result = sb.toString();
	        return result;
	    }
	}