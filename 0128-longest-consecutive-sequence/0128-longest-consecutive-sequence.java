class Solution {
    public int longestConsecutive(int[] nums) {

        //initiate set
        Set <Integer> set = new HashSet<>();
        for( int num : nums){
            set.add(num);
        }

        int longest = 0;

        //only if n-1 dont exists
        for(int num : set){
            if(!set.contains(num-1)){

                int current = num;
                int length = 1;
            

            //consicative terms
            while(set.contains(current + 1)){

                current++;
                length++;
            }
            //update
            longest = Math.max(longest, length);
         }
            }
         return longest;   
    }
}