class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count=0;
        for(int num:nums){
            int rem=0;
            while(num>0){
                rem=num%10;
                if(rem==digit){
                    count++;
                }
                num/=10;
            }
        }
        return count;
    }
}