class Solution {
    public int search(int[] nums, int target) {

        int left =0;
        int right =nums.length-1;

        while(left <= right){

            int mid = (left + right)/ 2;

            //found target
            if(nums[mid] == target){
                return mid;
            }

            //first sort left side of mid
            if(nums[left] <= nums[mid]){

                //target is in the let side
                if(nums[left] <= target && target < nums[mid] ){
                    right= mid-1;
                }
                //target is on theright!
                else{
                    left = mid + 1;
                }
            }
            //left not sorted right has to be
            else{

                if(nums[mid] < target && target <= nums[right]){
                    left = mid+1;
                }
                else{
                    right = mid -1;
                }

            }
        }
        return -1;
        
    }
}