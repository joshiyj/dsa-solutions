class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        sub(0,nums,new ArrayList<>());
        return result;
    }
    void sub(int idx, int[] arr, List<Integer> curr){
        if(idx==arr.length){
            result.add(new ArrayList<>(curr));
            return;
        }

        // Take ->
        curr.add(arr[idx]);
        sub(idx+1,arr,curr);

        // Not Take ->
        curr.remove(curr.size()-1);
        sub(idx+1,arr,curr);
    }
}