
public class SpiralMatrix2_59 {
	public int[][] generateMatrix(int n) {
		if(n <= 0){
			return new int[0][0];
		}

		int rStart = 0;
		int cStart = 0;
		int rEnd = n-1;
		int cEnd = n-1;
		int value = 1;
		int[][] matrix = new int[n][n];
		while(rStart <= rEnd && cStart <= cEnd){
			for(int i = cStart; i <= cEnd; i++){
				matrix[rStart][i] = value++;
			}
			rStart++;
			for(int i = rStart; i <= rEnd; i++){
				matrix[i][cEnd] = value++;
			}
			cEnd--;
			if(rEnd >= rStart){
				for(int i = cEnd; i >= cStart; i--)
					matrix[rEnd][i] = value++;
				rEnd--;
			}
			if(cEnd >= cStart){
				for(int i = rEnd; i >= rStart; i--)
					matrix[i][cStart] = value++;
				cStart++;
			}
		}
		return matrix;
	}
}