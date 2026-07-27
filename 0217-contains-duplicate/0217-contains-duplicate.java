class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> seen = new HashSet<>();

        //start the loop
        for(int i=0; i<nums.length; i++){

            //seen the member before?
            if(seen.contains(nums[i])){
                return true;
            }
            //as well as stoer the num
            seen.add(nums[i]);
        }
        return false;
    }
}