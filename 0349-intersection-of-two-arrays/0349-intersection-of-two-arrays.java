class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set <Integer> set1 = new HashSet<>();
        Set <Integer> result = new HashSet<>();

        //for first group
        for( int num : nums1){
            set1.add(num);
        }

        //for second group
        for(int num : nums2){
            if(set1.contains(num)){
                result.add(num);
            }
        }

        // rusults in array list
        int[] arr = new int[result.size()];
        int i =0;
        for(int num : result){
            arr[i++]=num;
        }
        return arr;
    }
}