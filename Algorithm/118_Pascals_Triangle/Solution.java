public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if (numRows == 0) {
            return list;
        }
        List<Integer> one = new ArrayList<>();
        one.add(1);
        list.add(one);
        if (numRows == 1) {
            return list;
        }
        List<Integer> two = new ArrayList<>();
        two.add(1);
        two.add(1);
        list.add(two);
        if (numRows == 2) {
            return list;
        }
        for (int i = 3; i <= numRows; i++) {
            List<Integer> tmp = new ArrayList<>();
            tmp.add(1);
            for (int j = 1; j < i - 1; j++) {
                tmp.add(list.get(i-2).get(j) + list.get(i-2).get(j-1));
            }
            tmp.add(1);
            list.add(tmp);
        }
        return list;
    }
}
