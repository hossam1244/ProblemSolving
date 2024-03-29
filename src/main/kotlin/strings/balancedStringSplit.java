package strings;

public class balancedStringSplit {

    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        balancedStringSplit(s);
    }

    static public int balancedStringSplit(String s) {
        int res = 0, count = 0;
        for (char c: s.toCharArray()) {
            count += c == 'R'? 1 : -1;
            if ( count == 0) ++res;
        }
        return res;
    }
}
