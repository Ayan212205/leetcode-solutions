class Solution {
    public int maxLength(int[] nums) {
        int n=nums.length;
        int ans=0;
        int j=0;
        while(j<n){
            int p=1;
            int l=1;
            int g=0;

            int i=j;
            while(i<n){
                p*=nums[i];
                g=gcd(g,nums[i]);
                l=lcm(l,nums[i]);

                if(p==g*l){
                ans=Math.max(ans,i-j+1);
                }
                i++;
            }
            j++;
        }
        return ans;
    }
    private int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    private int lcm(int a,int b){
        return  (a / gcd(a, b)) * b;
    }
}