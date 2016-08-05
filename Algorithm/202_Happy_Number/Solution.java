public class Solution {
    // 因为 not happy 都会进入 4 的循环所有判断，计算的结果是否返回 4 或者 1
    public boolean isHappy(int n) {
	    while (true) {
			n = cal(n);
			if (n == 1) {
				return true;
			} else if (n == 4) {
				return false;
			}
		}
	}

	private int cal(int n) {
		int sum = 0;
		while (n != 0) {
			int tmp = n % 10;
			sum = sum + tmp * tmp;
			n = n / 10;
		}
		return sum;
	}
}
