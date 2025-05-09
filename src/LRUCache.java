import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {
    private final int capacity;
    private LinkedHashMap<Integer, Integer> lruCache;

    public LRUCache(int capacity) {
        this.capacity = capacity;

        this.lruCache = new LinkedHashMap<>(capacity, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > LRUCache.this.capacity;
            }
        };
    }

    public int get(int key) {
        return lruCache.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        lruCache.put(key, value);
    }
}
