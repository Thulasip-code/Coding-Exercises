package com.algorithms.collections;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//Create your own Hash Map
public class HashMap<K,V> {
    private MapEntry<K,V>[] entrySet;
    private int size;
    private K[] keySet;


    public HashMap(){
       entrySet = (MapEntry<K,V>[])new Object[0];
       size = 0;
       keySet = (K[])new Object[0];
    }

    public void clear() {
        new HashMap<>();
    }


    public MapEntry<K, V>[] entrySet(){
        return entrySet;
    }

    public boolean containsKey(K key) {
        for(MapEntry<K,V> entry: entrySet) {
            if(entry.getValue().equals(key))
                return true;
        }

        return false;
    }

    public boolean containsValue(V value) {

        for(MapEntry<K,V> entry: entrySet) {
            if(entry.getValue().equals(value))
                return true;
        }

        return false;
    }

    public V get(Object key){

        for(MapEntry entry: entrySet)
            if(entry.getKey().equals(key))
                return (V)entry.getValue();

        return null;
    }

    public void put(K key, V value){
        int keySetSize= keySet.length;
        for(int i=0;i<keySetSize;i++){
            if(!keySet[i].equals(key))
            {
                entrySet[entrySet.length+1] = new MapEntry<>(key, value);
                keySet[keySet.length + 1] = key;
                size+= 1;
            }
        }
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return this.size == 0 ? true: false;
    }

    public Set<K> keySet(){
        return new HashSet<>(Arrays.asList(keySet));
    }

    public Collection<V> values(){
        Collection<V> values = new ArrayList<V>();
        for(MapEntry entry: entrySet){
            values.add((V)entry.getValue());
        }
        return values;
    }

    public V remove(Object key){
        V value = this.get(key);
        if(new HashSet<MapEntry>(Arrays.asList(entrySet)).removeIf(e->e.getKey().equals(key)))
            return value;
        return null;
    }
}
