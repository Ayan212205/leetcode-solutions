class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>result=new ArrayList<>();
        ArrayList<Integer>list=new ArrayList<>();
        getSubset(nums,list,0,result);
        return result;
    }
    private void getSubset(int[]nums,ArrayList<Integer> list,int i,List<List<Integer>>result){
        if(i==nums.length){
            result.add(new ArrayList<>(list)); // Adding in final list
            return;
        }
        list.add(nums[i]);// take element
        getSubset(nums,list,i+1,result);// for yes choice
        list.remove(list.size()-1);// remove element
        getSubset(nums,list,i+1,result);// for no choice;
    }
}