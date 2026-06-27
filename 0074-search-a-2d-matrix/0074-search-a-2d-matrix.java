class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int j = n -1;

        while(i<=m-1 && j >=0) {
            int value = matrix[i][j];
            if(value == target) {
                return true;
            } else if (value > target) j--;

            else i++;

        } return false;
    }
}