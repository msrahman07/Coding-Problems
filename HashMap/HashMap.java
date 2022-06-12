class MyHashMap {
    private ArrayList<Integer> keys;
    private ArrayList<Integer> values;
    public MyHashMap() {
        this.keys  = new ArrayList<Integer>();
        this.values = new ArrayList<Integer>();
    }
    
    public void put(int key, int value) {
        if(keys.indexOf(key) == -1){
            this.keys.add(key);
            this.values.add(value);   
        }else{
            this.values.set(keys.indexOf(key), value);
        }
    }
    
    public int get(int key) {
        //System.out.println(keys.indexOf(key));
        return (keys.indexOf(key) != -1 ) ? this.values.get(keys.indexOf(key)) : -1;
    }
    
    public void remove(int key) {
        int index = keys.indexOf(key);
        if(index != -1){
            this.values.remove(index);
            this.keys.remove(index);    
        }
        
    }
}

