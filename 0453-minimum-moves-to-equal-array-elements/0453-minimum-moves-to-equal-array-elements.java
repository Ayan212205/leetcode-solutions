class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        int minElement=Integer.MAX_VALUE;
        for(int num:nums){
            minElement=Math.min(num,minElement);
        }
        return sum-n*minElement;
    }
}