class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> matchMap = new HashMap<>();
        String[] strArray = s.split(" ");
        if(strArray.length != pattern.length()){
            return false;
        }
        for(int i=0; i<strArray.length; i++){
            if(matchMap.containsKey(pattern.charAt(i))){
                if(!matchMap.get(pattern.charAt(i)).equals(strArray[i])){
                    return false;
                }
            }else{
                if(matchMap.containsValue(strArray[i])){
                    return false;
                }
                matchMap.put(pattern.charAt(i), strArray[i]);
            }
        }
        return true;
    }
}
