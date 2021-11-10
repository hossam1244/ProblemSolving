
public class SearchInsert {

    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        int target = 5;
        System.out.println(searchInsert(nums,target));
    }

    static public int searchInsert(int[] nums, int target) {
        int size = nums.length;
        int l = 0, h = size - 1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                h = mid - 1;
            else if (nums[mid] < target)
                l = mid + 1;
        }
        return l;


//        if (target > nums[0]) return 0;
//          for (int i=0; i<nums.length; i++) {
//              if (nums[i] == target)
//                    return i;
//          }
//
//        for (int i = 1; i<nums.length; i++) {
//            if (target < nums[i] && target > nums[i-1]) {
//                return i;
//            }
//        }
//        return nums.length;
    }


}
