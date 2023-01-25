// In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different size r x c keeping its original data.
// You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns of the wanted reshaped matrix.
// The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.
// If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.

// Example 1:
// Input: mat = [[1,2],[3,4]], r = 1, c = 4
// Output: [[1,2,3,4]]

// Example 2:
// Input: mat = [[1,2],[3,4]], r = 2, c = 4
// Output: [[1,2],[3,4]]

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        int columns = mat[0].length;

        if ((rows * columns) != (r * c)) return mat;

        int[][] output_arr = new int[r][c];
        int row_num =  0;
        int column_num = 0;

        for (int i=0; i<rows; i++) {
            for (int j=0; j<columns; j++) {
                output_arr[row_num][column_num] = mat[i][j];
                column_num ++;
                if (column_num == c) {
                    column_num = 0;
                    row_num ++;
                }
            }
        }
        return output_arr;
    }
}
