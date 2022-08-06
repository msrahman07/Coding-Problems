class ReshapetheMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] reshaped = new int[r][c];
        int curr_row = 0;
        int curr_col = 0;
        if(mat.length*mat[0].length != r*c){
            return mat;
        }
        else{
            for(int i=0;i<mat.length;i++){
              for(int j=0; j<mat[i].length;j++){
                  //System.out.println(mat[i][j]);
                  if(curr_col == c){
                      curr_row++;
                      curr_col = 0;
                  }
                  reshaped[curr_row][curr_col] = mat[i][j];
                  curr_col++;
              }
            }    
        }
        return reshaped;
    }
}
