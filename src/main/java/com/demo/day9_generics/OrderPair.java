package com.demo.day9_generics;

public class OrderPair<K,V> implements Pair<K,V>{
   private K key;
   private V value;

    public OrderPair() {
    }

    public OrderPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "OrderPair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
