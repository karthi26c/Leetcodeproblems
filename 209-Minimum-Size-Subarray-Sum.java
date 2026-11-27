class Solution {
    public int minSubArrayLen(int target, int[] a) {
        int minlen=Integer.MAX_VALUE;
        int sum=0;
        int i=0;
        for(int j=0;j<a.length;j++) {
            sum=sum+a[j];
            while(sum>=target) {
                minlen=Math.min(minlen,j-i+1);
                sum=sum-a[i];
                i++;
            }
        }     
        if(minlen==Integer.MAX_VALUE)
            return 0;      
        return minlen;
    }
}