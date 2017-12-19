import java.util.LinkedList;
import java.util.Queue;

public class Mtrix_542 {
	    public int[][] updateMatrix(int[][] matrix) {
	        Queue<int[]> queue = new LinkedList<>();
	        int m = matrix.length;
	        int n = matrix[0].length;
	        int[][] dirs = new int[][] {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
	        
	        for(int i = 0; i < m; i++){
	            for(int j = 0; j < n; j++){
	                boolean[][] visited = new boolean[m][n];
	                if(matrix[i][j] != 0){
	                    queue.add(new int[] {i, j});
	                    visited[i][j] = true;
	                }
	                while(!queue.isEmpty()){
	                    int[] curr = queue.poll();
	                    for(int[] dir: dirs){
	                        int currX = curr[0] + dir[0];
	                        int currY = curr[1] + dir[1];
	                        if(currX >= 0 && currX < m && currY >= 0 && currY < n && visited[currX][currY] == false){
	                            if(matrix[currX][currY] == 0){
	                                matrix[i][j] = Math.abs(currX - i) + Math.abs(currY - j); 
	                                queue.clear();
	                                System.out.println(curr[0] +""+ curr[1] + currX + currY);
	                                break;
	                            }
	                            if(matrix[currX][currY] != 0){
	                                queue.add(new int[] {currX, currY});
	                                visited[currX][currY] = true;
	                            }
	                        }
	                    } 
	                }
	            }
	        }
	        return matrix;
	    }
	}