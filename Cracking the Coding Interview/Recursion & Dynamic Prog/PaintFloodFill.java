//733. Flood Fill

public class PaintFloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int currentColor = image[sr][sc];
        if(currentColor != color) {
            floodFillDfs(image, sr, sc, color, currentColor);
        } 
        return image;
    }
    private void floodFillDfs(int[][] image, int sr, int sc, int color, int currentColor) {
        if(sr < 0 || sr >= image.length || 
            sc < 0 || sc >= image[0].length) {
                return;
        }

        if(image[sr][sc] == currentColor) {
            image[sr][sc] = color;
            // four direction
            floodFillDfs(image, sr-1, sc, color, currentColor); // up
            floodFillDfs(image, sr+1, sc, color, currentColor); // down
            floodFillDfs(image, sr, sc-1, color, currentColor); // right
            floodFillDfs(image, sr, sc+1, color, currentColor); // left
        }
    }    
}
