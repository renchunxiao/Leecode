public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int index = 1;
        int tmp = nums[0];
        //tmp 记录了比较的临时变量
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != tmp) {
                nums[index++] = nums[i];
                tmp = nums[i];
            }
        }
        return index;
    }
}
