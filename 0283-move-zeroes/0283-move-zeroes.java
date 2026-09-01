class Solution {
    public void moveZeroes(int[] nums) {

        int k =0;

        //shift all zeros to rightest side
        for(int i =0; i<nums.length; i++){

            if(nums[i] != 0){
            nums[k] = nums[i];
            k++;
        }
        }

        //now make all duplicates zero
        for(int i=k; i<nums.length; i++){

            nums[i] =0;
        }
        
    }
}