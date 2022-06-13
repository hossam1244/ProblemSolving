package linkedlist;

import java.util.Arrays;

public class MyHashSet {

    private int[] set;

    public MyHashSet() {
        set = new int[1000001];
        Arrays.fill(set,-1);
    }

    public void add(int key) {
        set[key] = key;
    }

    public void remove(int key) {
        set[key] = -1;
    }

    public boolean contains(int key) {
        return set[key] != -1 ? true : false;
    }


}
