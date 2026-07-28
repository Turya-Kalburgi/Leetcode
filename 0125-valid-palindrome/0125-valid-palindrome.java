class Solution {
    public boolean isPalindrome(String s) {

        //initialize
        int left = 0; //O(1)

        int right = s.length()-1;  //O(1)

        //condition
        while( left < right){ //O(n), GOESE TO N/2 

            //skip non alphanumerical on left
            while( left < right && !Character.isLetterOrDigit(s.charAt(left))) left++; //O(n)

            //skip non alphanumerical on right
            while( left < right && !Character.isLetterOrDigit(s.charAt(right))) right--; //O(n)

            //to lower case and not equal return false
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) { //O(1)
                return false;  //O(1)
            }
             
             left++;    //O(1)
             right--;   //O(1)
        }
        return true;   //O(1)
    }
}