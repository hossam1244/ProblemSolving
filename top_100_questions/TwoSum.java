import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        addTwoSums(nums,target);
    }

    static public int[] addTwoSums(int[] nums,int target) {
        /**
         * hashmap to store values to keys
         * target - 7 = 2    fe 2 w msh equal le i then get it
         * target - 2 = 7    fe 7 w msh equal le i then get it
         */

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i=0; i<nums.length; i++) {
             map.put(nums[i], i);
        }


        for (int i=0; i < nums.length; i++) {
            int complement = target - nums[i];
            // map.get(key) means get el index w lw el index msh equal le el current index fe el loop then it's it :)
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] {i, map.get(complement)};
            }
        }

        return null;
    }
}




