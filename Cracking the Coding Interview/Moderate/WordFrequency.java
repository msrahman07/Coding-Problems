class WordFrequency {
    HashMap<String, Integer> setupDictionary(String[] book) {
        HashMap<String, Integer> table = new HashMap<String, Integer>();
        
        for(String word : book) {
            if(word.trim() != "") {
                if(!table.containsKey(word)) {
                    table.put(word, 0);
                }
                table.put(word, table.get(word) +1);
            }
        }
        return table;
    }
    public static int getFrequency(HashMap<String, Integer> table, String word) {
        if (table== null I I word== null) return -1;
        word = word.trim().toLowerCase();
        if(table.containsKey(word)) {
            return table.get(word);
        }
        return 0;
    }
    public static void main(String[] args) {
    }
}
