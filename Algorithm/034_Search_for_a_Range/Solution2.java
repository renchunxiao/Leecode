public class Solution2 {

    // 使用两次2分查找方法，先查找begin的边界，在查找end的边界，最后如果begin<=end说明查找到了元素
    // 主要分几种情况：

    // 1. 数组中不包含 target 元素，那么两次2分查找结果相同，并且 end < begin ,所以返回 [-1, -1]
    // 2. 数组包含一个 target 元素，那么最后经过2次查找后，定位到相同元素，即 end = begin
    // 3. 数组当中包含多个 target 元素，先找 begin 再找 end，下面的2个while循环
    //     1. 当查找 begin 的时候，当A[middle] == target 的时候，移动 end = middle - 1； 
    //     2. 当查找 end 的时候，当 A[middle] == target 是时候，移动 begin = middle + 1;

    public int[] searchRange(int[] A, int target) {
        int[] ret = {-1, -1};
        if (A.length == 0) {
            return ret;
        }
        
        int begin = 0;
        int end = A.length - 1;
        
        while (begin <= end) {
            int middle = begin + (end - begin) / 2;
            
            if (A[middle] < target) {
                begin = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        
        int begin1 = 0;
        int end1 = A.length - 1;
        while(begin1 <= end1) {
            int middle = begin1 + (end1 - begin1) / 2;
            
            if (A[middle] > target) {
                end1 = middle - 1;
            } else {
                begin1 = middle + 1;
            }
        }
        
        if (begin <= end1) {
            ret[0] = begin;
            ret[1] = end1;
        }
        
        return ret;
    }
    
}
