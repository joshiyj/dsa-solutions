class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<String> l1 = new ArrayList<>();
        for(String str: strs){
            char[] words = str.toCharArray();
            Arrays.sort(words);
            l1.add(new String(words));
        }

        List<List<String>> result = new ArrayList<>();
        HashMap<String,Integer> hash = new HashMap<>();
        int idx = 0;

        for(int i=0; i<l1.size(); i++){
            if(!hash.containsKey(l1.get(i))){
                List<String> temp = new ArrayList<>();
                temp.add(strs[i]);
                result.add(temp);
                hash.put(l1.get(i),idx);
                idx++;
            } else {
                int index = hash.get(l1.get(i));
                result.get(index).add(strs[i]);
            }
        }

        return result;
    }
}