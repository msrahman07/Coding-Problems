import java.util.Arrays;
import java.util.Comparator;

public class MaxHeightOfStackingCuboids {
    public int maxHeight(int[][] cuboids) {
        int n = cuboids.length;
        
        for(int i=0; i<n; i++) {
            Arrays.sort(cuboids[i]);
        }

        Arrays.sort(cuboids, new SortCuboids());
        
        int[] stackMap = new int[n];
        int maxHeight = 0;

        for(int i=0; i<n; i++) {
            stackMap[i] = cuboids[i][2]; // assign height
            
            for(int j=0; j<i; j++) {
                if(cuboids[j][0] <= cuboids[i][0] &&
                    cuboids[j][1] <= cuboids[i][1] &&
                    cuboids[j][2] <= cuboids[i][2]) {
                    
                    stackMap[i] = Math.max(stackMap[i], stackMap[j]+cuboids[i][2]);
                }                
            }
            maxHeight = Math.max(maxHeight, stackMap[i]);
        }
        return maxHeight;
    }

    private class SortCuboids implements Comparator<int[]> {
        @Override
        public int compare(int[] a, int[] b) {
            if(a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            } else if(a[1] != b[1]) {
                return Integer.compare(a[1], b[1]);
            } else {
                return Integer.compare(a[2], b[2]);
            }
        }
    }
}
