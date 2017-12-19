import java.util.List;
import java.util.ArrayList;

public class SpiralMatrix_54 {
	public List<Integer> spiralOrder(int[][] matrix) {

		List<Integer> result = new ArrayList<>();
		if(matrix == null || matrix.length ==0){
			return result;
		}
		int rEnd = matrix.length-1;
		int cEnd = matrix[0].length-1;
		int rStart = 0;
		int cStart = 0;
		while(rStart <= rEnd && cStart <= cEnd){
			for(int i = cStart; i <= cEnd; i++){
				result.add(matrix[rStart][i]);
			}
			rStart++;
			for(int i = rStart; i <= rEnd; i++){
				result.add(matrix[i][cEnd]);   
			}
			cEnd--;
			if(rEnd >= rStart){
				for(int i = cEnd; i >= cStart; i--)
					result.add(matrix[rEnd][i]);
				rEnd--;
			}

			if(cEnd >= cStart){
				for(int i = rEnd; i >= rStart; i--){
					result.add(matrix[i][cStart]);
				}
				cStart++;
			}
		}
		return result;
	}
}