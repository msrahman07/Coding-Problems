package HashTable;

public class HashTable<K, V> {
    private final int SIZE = 16;

    private HashEntry[] entries = new HashEntry[SIZE];

    public void put(K key, V value) {
        int index = getHash(key);
        if(entries[index] == null) {
            entries[index] = new HashEntry<>(key, value);
        } else {
            HashEntry<K,V> currEntry = entries[index];
            while(currEntry.getNext() != null) {
                currEntry.setNext(currEntry.getNext());
            }
            currEntry.setNext(new HashEntry<>(key, value));
        }
    }

    public V get(K key) {
        int index = getHash(key);
        HashEntry<K,V> currEntry = entries[index];
            
        while(currEntry != null) {
            if(currEntry.getKey() == key) {
                return currEntry.getValue();
            }
            currEntry.setNext(currEntry.getNext());
        }
        return null;
    }

    private int getHash(K key) {
        return key.hashCode() % SIZE;
    }

}
