class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1)
        return x;

        int l=1;
        int h=x;
        int m;

        while(l<=h){
            m=l+(h-l)/2;

            if((long)m * m>x)
            h=m-1;
            else if((long)m*m==x)
            return m;
            else
            l=m+1;
        }
        return Math.round(h);
    }
}