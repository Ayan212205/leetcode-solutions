class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        // Using Map  // Approach One
        int n=nums.length;
        List<List<Integer>>result=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        backTrack(nums,result,list,map);
        return result;
    }
    private static void backTrack(int[]nums,List<List<Integer>> result,ArrayList<Integer> list,HashMap<Integer,Integer>map){
        int n=nums.length;
        if(list.size()==n){
            result.add(new ArrayList<>(list));
            return;
        }
        for(int num:map.keySet()){
            if(map.get(num)>0){
                list.add(num);
                map.put(num, map.get(num) - 1);
                backTrack(nums,result,list,map);
                list.remove(list.size()-1);
                map.put(num, map.get(num) + 1);
            }
        }
    }

}