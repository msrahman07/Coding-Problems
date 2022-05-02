class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxArea;
        int left = 0;
        int right = height.length-1;
        
        maxArea = Math.min(height[left], height[right])*(right-left);
        
        while(left < right){
            if(height[left] <= height[right]){
                left++;
            }else{
                right--;
            }
            maxArea = Math.max(maxArea, Math.min(height[left], height[right])*(right-left));

        }
        
        return maxArea;
    }
}
