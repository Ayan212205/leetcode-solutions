class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>result=new ArrayList<>();
        ArrayList<Integer>list=new ArrayList<>();
        Arrays.sort(nums);
        getSubset(nums,list,0,result);
        return result;
    }
    private void getSubset(int[]nums,ArrayList<Integer> list,int i,List<List<Integer>>result){
        if (i == nums.length) {
            if (!result.contains(list)) {
                result.add(new ArrayList<>(list));
            }
            return;
        }
        list.add(nums[i]);// take element
        getSubset(nums,list,i+1,result);// for yes choice
        list.remove(list.size()-1);// remove element
        getSubset(nums,list,i+1,result);// for no choice;
    }
}