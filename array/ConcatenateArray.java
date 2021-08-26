package array;

public class ConcatenateArray {

    public static void main(String[] args) {
        int[] nums = {1,2,1};
        getConcatenation(nums);

    }

    static public int[] getConcatenation(int[] nums) {
       int ans[] = new int[nums.length * 2];

       for (int i=0; i<nums.length; i++) {
           ans[i] = nums[i];
           ans[i + nums.length] = nums[i];
       }

       return ans;
    }
}




