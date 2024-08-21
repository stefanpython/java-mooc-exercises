import java.util.ArrayList;

public class HashMap<K, V> {
    private static final int INITIAL_CAPACITY = 16; // initial capacity of the hash map
    private ArrayList<ArrayList<Entry<K, V>>> table;
    private int size;
    
    // Inner class to represent key-value pairs
    private static class Entry<K, V> {
        K key;
        V value;
        
        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
    
    // Constructor
    public HashMap() {
        this.table = new ArrayList<>(INITIAL_CAPACITY);
        for (int i = 0; i < INITIAL_CAPACITY; i++) {
            table.add(new ArrayList<Entry<K, V>>());
        }
        this.size = 0;
    }
    
    // Hash function
    private int hash(K key) {
        return key.hashCode() % table.size();
    }
    
    // Put key-value pair into the map
    public void put(K key, V value) {
        int index = hash(key);
        ArrayList<Entry<K, V>> bucket = table.get(index);
        
        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                entry.value = value; // Update existing key
                return;
            }
        }
        
        // If key not found, add new entry
        bucket.add(new Entry<>(key, value));
        size++;
    }
    
    // Get value for a key
    public V get(K key) {
        int index = hash(key);
        ArrayList<Entry<K, V>> bucket = table.get(index);
        
        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        
        return null; // Key not found
    }
    
    // Remove key-value pair from the map
    public void remove(K key) {
        int index = hash(key);
        ArrayList<Entry<K, V>> bucket = table.get(index);
        
        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                bucket.remove(entry);
                size--;
                return;
            }
        }
    }
    
    // Return the size of the map
    public int size() {
        return size;
    }
    
    // Check if the map is empty
    public boolean isEmpty() {
        return size == 0;
    }}