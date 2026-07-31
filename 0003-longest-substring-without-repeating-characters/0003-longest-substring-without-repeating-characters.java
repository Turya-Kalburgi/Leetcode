class Solution {
    public int lengthOfLongestSubstring(String s) {

        //hashset
        Set<Character> seen = new HashSet<>();

        //initialize 
        int left =0;
        int maxlen =0;

        //current char, outer loop
        for(int right=0; right<s.length(); right++){

            //seen character?
            while(seen.contains(s.charAt(right))){

                //remove left
                seen.remove(s.charAt(left));
                //move towars right
                left++;
            }
            //if not seen then add
            seen.add(s.charAt(right));

            //maxlen
            maxlen = Math.max(maxlen,right - left + 1);
        }
        return maxlen;
    }
}