class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        //ArrayList
        List<List<Integer>> result = new ArrayList<>();

        //sort
        Arrays.sort(nums);

        //outer loop
        for(int i = 0; i<nums.length -2; i++){

            if(i > 0 && nums[i] == nums[i-1]) continue;

            //left right
            int left = i+1;
            int right = nums.length-1;

            //while
            while(left < right){
                
                //int sum
                int sum = nums[i] + nums[left] + nums[right];

                //3 conditions
                if(sum == 0){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // no duplicates!
                    while(left < right && nums[left] == nums[left + 1]) left++;
                    while(left < right && nums[right] == nums[right-1]) right--;

                    left++;
                    right--;
                } else if (sum < 0){
                    left++;
                    }else{
                        right--;
                    }
                }
        }
       return result;
    }
}
