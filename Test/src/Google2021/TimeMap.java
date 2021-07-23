package Google2021;

import java.util.ArrayList;
import java.util.HashMap;

class TimeMap {
    HashMap<String, ArrayList<Pair>> cache = new HashMap();

    /** Initialize your data structure here. */
    public TimeMap() {

    }

    public void set(String key, String value, int timestamp) {
        Pair pair = new Pair(value, timestamp);
        cache.computeIfAbsent(key, x -> new ArrayList<Pair>()).add(pair);
    }

    public String get(String key, int timestamp) {
        if (!cache.containsKey(key)) {
            return "";
        }
        ArrayList<Pair> arr = cache.get(key);
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m).timestamp > timestamp) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        if (r < 0) {
            return "";
        }
        return arr.get(r).value;
    }
}

class Pair {
    String value;
    int timestamp;
    public Pair(String v, int ts) {
        value = v;
        timestamp = ts;
    }
}