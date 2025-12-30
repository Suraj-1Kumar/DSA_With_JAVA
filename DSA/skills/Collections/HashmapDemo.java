package DSA.skills.Collections;

import java.util.*;

public class HashmapDemo {
    static class MyHashMap<K, V>{
        public static final int Default_Capacity = 4;
        public static final float Load_Factor = 0.75f;
        
        private class Node{
            K key;
            V value;

            Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n;

        private LinkedList<Node>[] buckets;

        private void intiBucketArray(int N){
            for(int i = 0; i < buckets.length; i++){
                buckets[i] = new LinkedList<>();
            }
        }    

        private int HashFunction(K key){
            int hc = key.hashCode();
            return Math.abs(hc) % buckets.length;
        }

        public MyHashMap(){
            intiBucketArray(Default_Capacity);
        }
        
        public int size(){
            return n;
        }

        public void put(K key, V value){

        }
    }
    public static void main(String[] args) {
        
    }
}
