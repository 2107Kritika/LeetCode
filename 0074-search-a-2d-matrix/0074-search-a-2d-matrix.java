class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=matrix.length;
        int c=matrix[0].length;
        int l=0;
        int h=r*c-1;
        int m,mid;

        while(l<=h){
            mid=l+(h-l)/2;
            m=matrix[mid/c][mid%c];
            if(m==target)
            return true;
            else if(m>target)
            h=mid-1;
            else
            l=mid+1;
        }
        return false;
    }
}