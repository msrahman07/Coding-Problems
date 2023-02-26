public class ZeroMatrix {
    public void setZeroes(int[][] matrix) {
        /* Extra space (O(M+N))
            Set<Integer> zeroRows = new HashSet();
            Set<Integer> zeroColumns = new HashSet();

            for(int r = 0; r < matrix.length; r++) {
                for(int c = 0; c < matrix[r].length; c++) {
                    if(matrix[r][c] == 0) {
                        zeroRows.add(r);
                        zeroColumns.add(c);
                    }
                }
            }
            for(int r = 0; r < matrix.length; r++) {
                for(int c = 0; c < matrix[r].length; c++) {
                    if(zeroRows.contains(r) || zeroColumns.contains(c)) {
                        matrix[r][c] = 0;
                    }
                }
            }
            // for(int r : zeroRows) {
            //     for(int c = 0; c < matrix[r].length; c++) {
            //         matrix[r][c] = 0;
            //     }
            // }

            // for(int c : zeroColumns) {
            //     for(int r = 0; r < matrix.length; r++) {
            //         matrix[r][c] = 0;
            //     }
            // }
        */
        // In place
        boolean isFirstRowZero = false;
        boolean isFirstColumnZero = false;

        for(int row = 0; row < matrix.length; row++) {
            if(matrix[row][0] == 0) {
                isFirstColumnZero = true;
                break;
            }
        }
        for(int col = 0; col < matrix[0].length; col++) {
            if(matrix[0][col] == 0) {
                isFirstRowZero = true;
                break;
            }
        }

        for(int row = 1; row < matrix.length; row++) {
            for(int col = 1; col < matrix[row].length; col++) {
                if(matrix[row][col] == 0) {
                    matrix[row][0] = 0;
                    matrix[0][col] = 0;
                }
            }
        }
        for(int row = 1; row < matrix.length; row++) {
            for(int col = 1; col < matrix[row].length; col++) {
                if(matrix[row][0] == 0 || matrix[0][col] == 0) {
                    matrix[row][col] = 0;
                }
            }
        }
        if(isFirstRowZero) {
            for(int col = 0; col < matrix[0].length; col++) {
                matrix[0][col] = 0;
            }
        }
        if(isFirstColumnZero) {
            for(int row = 0; row < matrix.length; row++) {
                matrix[row][0] = 0;
            }
        }
    }
}
