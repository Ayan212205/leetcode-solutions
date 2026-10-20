class Solution {
//     public List<List<Integer>> permute(int[] nums) {
//         List<List<Integer>>result=new ArrayList<>();
//         ArrayList<Integer> list=new ArrayList<>();
//         backTrack(list,nums,result);
//         return result;
//     }
//     private void backTrack(ArrayList<Integer> list,int[]nums,List<List<Integer>> result){ // using list 
//         int n=nums.length;
//         if(list.size()==n){
//             result.add(new ArrayList<>(list));
//             return;
//         }
//         for(int i=0;i<n;i++){
//             if(!list.contains(nums[i])){
//                 list.add(nums[i]);
//                 backTrack(list,nums,result);
//                 list.remove(list.size()-1);
//             }
//         } 
//     }
    // using boolean flag
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>result=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        boolean[] used=new boolean[nums.length];
        backTrack(list,nums,result,used);
        return result;
    }
    private void backTrack(ArrayList<Integer> list,int[]nums,List<List<Integer>> result,boolean[] used){
        if(list.size()==nums.length){
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!used[i]){
                list.add(nums[i]);
                used[i]=true;
                backTrack(list,nums,result,used);
                list.remove(list.size()-1);
                used[i]=false;
            }

        }
    }
}