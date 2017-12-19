import java.util.*;

public class NumberOfIsland_200 {
	    public int numIslands(char[][] grid) {
	        if(grid == null || grid.length == 0 || grid[0].length == 0){
	            return 0;
	        }
	        int result = 0;
	        int m = grid.length;
	        int n = grid[0].length;
	        Queue<int[]> queue = new LinkedList<>();
	        boolean[][] visited = new boolean[m][n];
	        int[][] dirs = new int[][] {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
	        for(int i = 0; i < m; i++){
	            for(int j = 0; j < n; j++){
	                if(grid[i][j] == '1' && visited[i][j] == false){
	                    queue.add(new int[] {i,j});
	                    visited[i][j] = true;
	                    result++;
	                }
	                while(!queue.isEmpty()){
	                    int[] curr = queue.poll();
	                    for(int[] dir: dirs){
	                        int p = curr[0] + dir[0];
	                        int q = curr[1] + dir[1];
	                        if(p >= 0 && p < m && q >= 0 && q < n ){
	                            if(grid[p][q] == '1' && visited[p][q] == false){
	                                queue.add(new int[] {p,q});
	                                visited[p][q] = true;
	                            }
	                        }
	                    }
	                }
	            }
	        }
	        return result;
	    }
	}