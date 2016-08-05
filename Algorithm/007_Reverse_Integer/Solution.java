public class Solution {
    public int reverse(int x) {
        if (x == 0) {
            return 0;
        }
        long ret = 0;
        
        while (x != 0) {
            ret = ret * 10 + x % 10;
            x = x / 10;
        }
        
        if (ret > Integer.MAX_VALUE || ret < Integer.MIN_VALUE) {
        	return 0;
        }

        return (int)ret;
    }
    public int reverse2(int n) {
        int reversed_n = 0;
        
        while (n != 0) {
            int temp = reversed_n * 10 + n % 10;
            n = n / 10;
            if (temp / 10 != reversed_n) {
		//这个地方 通过 tmp 临时变量来判断，返回结果*10之后是否越界，如果越界返回0，并且跳出。
                reversed_n = 0;
                break;
            }
            reversed_n = temp;
        }
        return reversed_n;
    }
}
