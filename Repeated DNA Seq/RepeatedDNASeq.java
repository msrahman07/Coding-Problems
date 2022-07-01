class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Map<String, Integer> dnaSeq = new HashMap<>();
        
        String tenLtrSeq = "";
        List<String> repeatedSeq = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            if(i+10 <= s.length()){
                tenLtrSeq = s.substring(i, i+10);
                if(dnaSeq.containsKey(tenLtrSeq)){
                    dnaSeq.put(tenLtrSeq, dnaSeq.get(tenLtrSeq)+1);
                }else{
                    dnaSeq.put(tenLtrSeq, 1);
                }
            }
        }

        dnaSeq.forEach((k,v) -> {
            if((int)v > 1){
                repeatedSeq.add((String)k);
            }
        });
        
        return repeatedSeq;
    }
}
