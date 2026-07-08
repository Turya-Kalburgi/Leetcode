import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        //create notepad
        HashMap <Integer , Integer> seen = new HashMap<>();

        //ieration
        for(int i=0; i<nums.length; i++){

            //one by one from (nums)
            int num = nums[i];

            //looing for match
            int match = target - num;

            //check match esisting in notepad or not
            if(seen.containsKey(match)){

                //retun bot matches indexes
                return new int[]{seen.get(match),i};
            }
            //for no matches
            seen.put(num,i);
        }
        //empty new array
        return new int[]{};  
    }
}