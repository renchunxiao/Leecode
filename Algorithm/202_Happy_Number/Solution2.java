public class Solution2 {
    private int getNextHappy(int n) {
        int sum = 0;
        while (n != 0) {
            sum += (n % 10) * (n % 10);
            n /= 10;
        }
        return sum;
    }
    
    public boolean isHappy(int n) {
        HashSet<Integer> hash = new HashSet<Integer>();
        // 使用 set 记录在计算过程当中的数据，如果有重复的那么就说明这个数not happy，因为 happy number 的计算路径最后一定能到1，如果有重复就说明是不能到1了
        while (n != 1) {
            if (hash.contains(n)) {
                return false;
            }
            hash.add(n);
            n = getNextHappy(n);
        }
        return true;
    }
}
