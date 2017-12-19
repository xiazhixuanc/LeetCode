public class ReshapeMatrix_566 {
	    public int[][] matrixReshape(int[][] nums, int r, int c) {
	        int m = nums[0].length;
	        if(r*c != nums.length*m){
	            return nums;
	        }
	        int[][] matrix = new int[r][c];
	        for(int i = 0; i < r*c; i++){
	            matrix[i/c][i%c] = nums[i/m][i%m];
	        }
	        return matrix;
	    }
	}
