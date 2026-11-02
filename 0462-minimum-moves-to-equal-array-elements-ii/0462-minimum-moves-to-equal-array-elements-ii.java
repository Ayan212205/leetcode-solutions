class Solution {
    public int minMoves2(int[] nums) {
        // Approach One n*nlogn
        int n=nums.length;
        Arrays.sort(nums);
        int moves=0;
        int mid=n/2;
        for(int i=0;i<n;i++){
            moves+=Math.abs(nums[i]-nums[mid]);
        }
        return moves;
    }
}