
public class SurroundedRegions_130 {
	    class UnionFind{
	        private int[] rank;
	        private int[] id;
	        private int count;
	        UnionFind(int x){
	            rank = new int[x];
	            id = new int[x];
	            count = x;
	            for(int i = 0; i < x; i++){
	                id[i] = i;
	                rank[i] = 0;
	            }
	        }
	        public int find(int x){
	            while(x != id[x]){
	                id[x] = id[id[x]];
	                x = id[x];
	            }
	            return x;
	        }
	        public void union(int i, int j){
	            int p = find(i);
	            int q = find(j);
	            if(p == q){
	                return;
	            }
	            if(rank[p] < rank[q]){
	                id[p] = q;
	            }
	            else if(rank[p] > rank[q]){
	                id[q] = p;
	            }
	            else{
	                id[p] = q;
	                rank[q]++;
	            }
	            count--;
	        }
	        public boolean checkUnion(int i, int j){
	            return find(i) == find(j);
	        }
	    }
	    public void solve(char[][] board) {
	        if(board.length == 0){
	            return;
	        }
	        int m = board.length;
	        int n = board[0].length;
	        UnionFind UF = new UnionFind(m * n + 1);
	        for(int i = 0; i < m; i++){
	            for(int j = 0; j < n; j++){
	                if((i == 0 || j == 0 || i == m-1 || j == n-1) && board[i][j] == 'O'){
	                     UF.union(m * n, n * i + j);
	                }
	                else if(board[i][j] == 'O'){
	                    if(board[i-1][j] == 'O'){
	                        UF.union(i * n + j, (i-1) * n + j);
	                    }
	                    if(board[i+1][j] == 'O'){
	                        UF.union((i+1) * n + j, i * n + j);
	                    }
	                    if(board[i][j-1] == 'O'){
	                        UF.union(i * n + (j-1), i * n + j);
	                    }
	                    if(board[i][j+1] == 'O'){
	                        UF.union(i * n + (j+1), i * n +j);
	                    }
	                }
	            }
	        }
	        for(int i = 0; i < m; i++){
	            for(int j = 0; j < n; j++){
	                if(!UF.checkUnion(i * n + j, m * n ) ){
	                    board[i][j] = 'X';
	                }
	            }
	        }
	    }
	}
