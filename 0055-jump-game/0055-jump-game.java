class Solution {
    public boolean canJump(int[] nums) {
        int max1=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i>max1){
                return false;
            }
            max1=Math.max(max1,i+nums[i]);
        }
        return true;
    }
}