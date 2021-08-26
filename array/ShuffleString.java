package array;

import java.util.Arrays;

public class ShuffleString {

    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        restoreString(s, indices);
    }

    static public String restoreString(String s, int[] indices) {
        char charArr[]= s.toCharArray();
        char mans[]=new char[indices.length];
        String ans =null;
        int arr[]=new int[indices.length];
        for (int i = 0; i < s.length(); i++) {
            mans[indices[i]]=charArr[i];
        }
        String fans=String.valueOf(mans);  //convert char array to string
        return fans;
    }
}
