public class RotateMatrixImage {
    public void rotate(int[][] matrix) {
        // int n = matrix.length;
        // for(int i = 0; i < (n+1)/2; i++) {
        //     for(int j = 0; j < n/2; j++) {
        //         int temp = matrix[n-1-j][i];
        //         matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
        //         matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
        //         matrix[j][n-1-i] = matrix[i][j];
        //         matrix[i][j] = temp;
        //     }
        // }
        int n = matrix.length;
        int left = 0, right = n-1;

        while(left < right) {
            // offset is how many points to the right/left/up/down shift
            for(int offset = 0; offset < right-left; offset++) {
                int top = left, bottom = right;

                // storing top left value
                int topLeft = matrix[top][left + offset];
                // shifting bottom left value to topleft
                matrix[top][left + offset] = matrix[bottom - offset][left];
                // shifting bottom right value to bottom left
                matrix[bottom - offset][left] = matrix[bottom][right - offset];
                // shifting top right value to bottom right
                matrix[bottom][right - offset] = matrix[top + offset][right];
                // storing topleft to top right
                matrix[top + offset][right] = topLeft;
            }
            left++; right--;
        }
    }
}
