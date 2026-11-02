class Solution {
    public int minMoves2(int[] nums) {
        // Approach One n*nlogn
        // int n=nums.length;
        // Arrays.sort(nums);
        // int moves=0;
        // int mid=n/2;
        // for(int i=0;i<n;i++){
        //     moves+=Math.abs(nums[i]-nums[mid]);
        // }
        // return moves;
        // Approach 2  n/2*nlogn;
        int n=nums.length;
        Arrays.sort(nums);
        int moves=0;
        int mid=n/2;
        for(int i=0;i<n/2;i++){
            moves+=Math.abs(nums[i]-nums[mid]);
            moves+=Math.abs(nums[n-i-1]-nums[mid]);
        }
        return moves;
    }
}