class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>result=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        backTrack(list,nums,result);
        return result;
    }
    private void backTrack(ArrayList<Integer> list,int[]nums,List<List<Integer>> result){
        int n=nums.length;
        if(list.size()==n){
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<n;i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
                backTrack(list,nums,result);
                list.remove(list.size()-1);
            }
        }
        
    }

}