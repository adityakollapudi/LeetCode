class Solution {
    public int countIntersectingIntervals(int[][] intervals) {
        int count=0;
        for(int i=0;i<intervals.length;i++){
            for (int j = i + 1; j < intervals.length; j++) {
                if (Math.max(intervals[i][0], intervals[j][0]) <= Math.min(intervals[i][1], intervals[j][1])) {
                    count++;
                }
            }
        }
        return count;
    }
}
