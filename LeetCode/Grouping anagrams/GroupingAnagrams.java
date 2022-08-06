class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s : strs){
            char ch[] = s.toCharArray();
            Arrays.sort(ch);
            String s1 = new String(ch);
            map.putIfAbsent(s1,new ArrayList<String>());
            map.get(s1).add(s);
        }
        List<List<String>> li = new ArrayList<>();
        for(Map.Entry<String,List<String>> it : map.entrySet()){
            li.add(it.getValue());
        }
        return li;
    }
}
