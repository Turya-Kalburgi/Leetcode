class Solution {
    public int[] twoSum(int[] nums, int target) {

        //start Map
        Map<Integer, Integer> map = new HashMap<>();

        //start the loop
        for(int i =0; i< nums.length; i++){

            //what you need
            int need = target - nums[i];

            //ye num dekha hei kya?
            if(map.containsKey (need)){
                //ffir tu return kar ek list with the indexes of both numbers 
                return new int[]{map.get(need),i};
                //return kar new int jsime hoga current int and and needed and index
            }
            //agar nahi dekha then store it for future
            map.put(nums[i],i);
            //if dekha toh nahi toh current number and uska index
        }
        return new int[]{};
        //kuch na kuch return karna hi hein
    }
}