class Solution {
    public int heightChecker(int[] heights) {
        int n=heights.length;
        int[] expected= heights.clone();
        Arrays.sort(expected);
        int count=0;
        for(int i=0;i<n;i++){
            if(expected[i]!=heights[i]){
                count++;
            }
        }
        return count;
    }
}