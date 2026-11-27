class Solution {
    public long minimumRemoval(int[] beans) {
        Arrays.sort(beans);
        long sum=0;
        for(int bean:beans){
            sum+=bean;
        }
        int n=beans.length;
        long ans=Long.MAX_VALUE;
        for(int i=0;i<n;i++){
            long remain=(long) beans[i]*(n-i);
            long remove=sum-remain;
            ans=Math.min(ans,remove);
        }
        return ans;
    }
}