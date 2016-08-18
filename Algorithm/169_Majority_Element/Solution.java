public class Solution {
    public int majorityElement(int[] nums) {
        int tmp = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                count++;
                tmp = nums[i];
            } else if (tmp == nums[i]) {
                count++;
            } else if (tmp != nums[i]) {
                count--;
            }
        }
        return tmp;
    }
}
