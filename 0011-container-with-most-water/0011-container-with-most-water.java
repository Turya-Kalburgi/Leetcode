class Solution {
    public int maxArea(int[] height) {

        //inilize
        int left = 0;
        int right = height.length-1;
        int maxArea = 0;

        //condition
        while(left < right){

            //formula
            int area= Math.min(height[left], height[right]) * (right - left);

            //MaxArea
            maxArea = Math.max(maxArea, area);

            //cases
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
}