public class Solution {
    public List<Integer> getRow(int numRows) {
        numRows = numRows + 1;
        List<Integer> list = new ArrayList<>();
        if (numRows == 0) {
            return list;
        }
        list.add(1);
        if (numRows == 1) {
            return list;
        }
        list.add(1);
        if (numRows == 2) {
            return list;
        }
        for (int i = 3; i <= numRows; i++) {
            List<Integer> tmp = new ArrayList<>();
            tmp.add(1);
            for (int j = 1; j < i - 1; j++) {
                tmp.add(list.get(j) + list.get(j-1));
            }
            tmp.add(1);
            list = tmp;
        }
        return list;
    }
}
