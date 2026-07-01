class Solution {
    public int[] twoSum(int[] nums, int target) {

        //create HashMap
        HashMap<Integer, Integer> seen = new HashMap<>();

        //list to start
        for(int i=0; i<nums.length; i++){

            //first num start
            int num = nums[i];

            //number need to reach target
            int need = target - num;

            //already seen the number
            if(seen.containsKey(need)){

                //return index of needed and current 
                return new int[]{seen.get(need),i};
            }
            //current number and its index
            seen.put(num,i);
        }
        //for no match
        return new int[]{};      
    }
}