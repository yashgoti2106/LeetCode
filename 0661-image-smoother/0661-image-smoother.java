class Solution {
    public int[][] imageSmoother(int[][] img) {
        int n = img.length;
        int m = img[0].length;
        int res[][] = new int[n][m];

                int dx[] = {-1,-1,-1,0,1,1,1,0,0};
                int dy[] = {-1,0,1,1,1,0,-1,-1,0};
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int sum = 0 ;
                int countN = 0;
                for (int x = 0; x < 9; x++) {
                    int ni = i + dx[x];
                    int nj = j + dy[x];
                    if(ni >= 0 && ni <=n-1 && nj >= 0 && nj <= m-1) {
                        countN += 1;
                        sum += img[ni][nj];
                        res[i][j] = sum/countN; 
                    }
                }

            }
        }return res;
    }
}