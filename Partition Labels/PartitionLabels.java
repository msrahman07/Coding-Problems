class Solution {
//     public List<Integer> partitionLabels(String s) {
//         List<Integer> res = new ArrayList<>();
//         Map<Character, int[]> strMap = new HashMap<>();
//         char currentChar;
//         for(int i=0; i<s.length(); i++){
//             currentChar = s.charAt(i);
//             if(strMap.containsKey(currentChar)){
//                 strMap.get(currentChar)[1] = i+1;
//                 strMap.put(currentChar, strMap.get(currentChar));
//             }else{
//                 strMap.put(currentChar, new int[] {i+1,0});
//             }
//         }
//         for (Map.Entry<Character, int[]> entry : strMap.entrySet()) {
//             System.out.println(entry.getKey()+" : ");
//             int[] arr = entry.getValue();
//             for(int i=0; i<arr.length; i++){
//                 System.out.print(arr[i]+",");
//             }
//         }
        
        
//         int currPartition = strMap.get(s.charAt(0))[1];
//         res.add(currPartition);
//         int listIndex = 0;
//         // for(int i=1; i<s.length(); i++){
//         //     currentChar = s.charAt(i);
//         //     if(strMap.get(currentChar)[0] < currPartition){
//         //         if(strMap.get(currentChar)[1] > currPartition){
//         //             res.set(listIndex, res.get(listIndex)+(strMap.get(currentChar)[1] - currPartition));            
//         //         }
//         //     }else{
//         //         listIndex++;
//         //         currPartition = strMap.get(s.charAt(i))[1];
//         //         res.add(currPartition);
//         //     }
//         // }
        
//         for (Map.Entry<Character, int[]> entry : strMap.entrySet()) {
//             if(entry.getValue()[0] < currPartition){
//                 if(entry.getValue()[1] > currPartition){
//                     res.set(listIndex, res.get(listIndex)+(entry.getValue()[1] - currPartition));            
//                 }
//             }else{
//                 listIndex++;
//                 currPartition = entry.getValue()[1];
//                 res.add(currPartition);
//             }
//         }
//         return res;
//     }
    public List<Integer> partitionLabels(String S) {
        int[] last = new int[26];
        for (int i = 0; i < S.length(); ++i)
            last[S.charAt(i) - 'a'] = i;
        
        int j = 0, anchor = 0;
        List<Integer> ans = new ArrayList();
        for (int i = 0; i < S.length(); ++i) {
            j = Math.max(j, last[S.charAt(i) - 'a']);
            if (i == j) {
                ans.add(i - anchor + 1);
                anchor = i + 1;
            }
        }
        return ans;
    }
}
