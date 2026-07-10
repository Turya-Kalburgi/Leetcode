class Solution {
    public boolean isAnagram(String s, String t) {
        
        // same characters
        if(s.length() != t.length()){
            return false;
        }    

            // make array of 26
            int[] count = new int[26];

            //add s sub t
            for(int i=0; i<s.length() ; i++){

                count[s.charAt(i) - 'a']++;
                count[t.charAt(i) - 'a']--;
            }
            //count should be zero
            for(int c : count){
                if(c != 0){
                    return false;
                }
            }
        return true;
    }
}