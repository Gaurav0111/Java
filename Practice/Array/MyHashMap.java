package Array;

import java.util.*;

public class MyHashMap {

    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    public MyHashMap() {
    }

    public void put(int key, int value) {
        map.put(key, value);
    }

    public int get(int key) {
        try{
            return map.get(key);
        }
        catch(Exception e){
            return -1;
        }
    }

    public void remove(int key) {
        map.remove(key);
    }

    public static void main(String[] args) {

    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
