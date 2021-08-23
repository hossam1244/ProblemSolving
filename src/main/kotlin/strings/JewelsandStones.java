package strings;

public class JewelsandStones {


    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        numJewelsInStones(jewels,stones);

    }


    static public int numJewelsInStones(String jewels, String stones) {
        char[] newStones = stones.toCharArray();
        int count = 0;
        for (int i=0; i<newStones.length; i++) {
            if (jewels.contains(newStones[i] + "")) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }



}
