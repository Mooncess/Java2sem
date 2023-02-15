package task3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SynchronizedMap <K,V>{
    private HashMap<K,Object> map = new HashMap<K,Object>();
    private int size=0;

    public synchronized Object put(K key, Object value){
        size++;
        return map.put(key,value);
    }


    public synchronized Object get(K key) {
        return map.get(key);
    }

    public synchronized Object remove(K key) {
        size--;
        return map.remove(key);
    }

    public synchronized boolean containsKey(K key) {
        return map.containsKey(key);
    }

    public synchronized boolean containsValue(Object value) {
        return map.containsValue(value);
    }
    public synchronized int size(){
        return size;
    }



}
