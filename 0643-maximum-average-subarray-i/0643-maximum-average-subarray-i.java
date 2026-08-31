class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int windowSum = 0;

        //first window
        for(int i =0; i<k; i++ ){

            windowSum += nums[i];
        }
           int maxSum = windowSum;
        
        //for second window
        for(int i=k; i<nums.length; i++){

            windowSum -= nums[i-k];

            windowSum += nums[i];

            maxSum = Math.max(maxSum, windowSum);
        }

        return (double) maxSum/k;
    }
}