import com.sun.org.apache.xpath.internal.operations.String;

import java.util.Set;
import java.util.Map;
import java.util.HashMap;

/**
 * Created by user on 8/22/2017.
 */
public class MyMap <String,Integer>{

//    MyMap<K,V> map = new MyMap<K,V>();
//
//    public V get(K key){
//        return map.get(key);
//    }
//    public MyMap<K, V> put(K key, V value){
//        map.put(key,value);
//        return  map;
//    }
//    public int size(){
//        return map.size();
//    }
//    public MyMap<K, V> remove(K key){
//        map.remove(key);
//        return map;
//    }
//    //get all keys
//    public Set<K> keySet(){
//        return  map.keySet();





    public Map<String,Integer> map = new HashMap<String,Integer>();
    public Integer get(String key){
        return map.get(key);
    }
    public Map put(String key,Integer value){
        map.put(key,value);
        return  map;
    }
    public int size(){
        return map.size();
    }
    public Map remove(String key){
        map.remove(key);
        return map;

    }
    //get all keys
    public Set<String> keySet(){
        return  map.keySet();

    }
}
