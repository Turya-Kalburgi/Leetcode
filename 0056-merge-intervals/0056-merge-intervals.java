class Solution {
    public int[][] merge(int[][] intervals) {

        //1.sort
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));

        //2. store merge intervals
        List <int[]> result = new ArrayList<>();

        //start with first interval
        int[] current = intervals[0];

        //outerloop
        for(int i=1; i<intervals.length; i++){

            //int next declear
            int[] next = intervals[i];

            // overlap condition
            if(next[0] <= current[1]){

                //current , next k max uthao for merge - bade tak maerge!
                current[1] = Math.max(current[1],next[1]);
            }else{
            //if they dont overlap
            result.add(current);
            current =next;
            }
        }
    
    //add last interval
    result.add(current);

    //return 2D array
    return result.toArray(new int[result.size()][]);
    }
}