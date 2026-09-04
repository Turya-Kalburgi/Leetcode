class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] output = new int[nums.length];

        int leftProduct = 1;

        //left product
        for(int i=0; i<nums.length;i++){

            output[i] = leftProduct;

            leftProduct *= nums[i];
        }

        int rightProduct = 1;

        //right product

        for(int i = nums.length -1; i>=0; i--){

            output[i] *= rightProduct;

            rightProduct *= nums[i];
        }

        return output;
    }
}
        
    
