package CrackingTheCodingInterview.ArrayAndStrings;

import java.util.HashMap;

public class ArrayAndStrings {
    public static void main(String[] args) {

        String isUniqueString = "abcd";
        isUnique(isUniqueString);
    }


    static private boolean isUnique(String s) {
        //  Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
        if (s.length() > 128) return false;

        boolean[] char_set = new boolean[128];

        for (int i = 0; i < s.length(); i++) {
            int val = s.charAt(i);
            if (char_set[val]) { // already found this char at this value
                return false;
            }
            char_set[val] = true;
        }

        return true;


    }
}
