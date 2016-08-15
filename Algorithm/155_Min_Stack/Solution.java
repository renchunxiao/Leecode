public class MinStack {
        

        //stack当中存放的是当前值与最小值的差值

        Stack<Long> stack = new Stack<Long>();

	long min;

	public void push(int x) {
		if (stack.isEmpty()) {
			stack.push(0L);
			min = x;
		} else {
			stack.push(x - min);//如果当前x小于min那么这个值是负数
			if (x < min) {
			    min = x;//如果x是小于当前min的，那么把x赋值给min
			}
		}
	}

	public void pop() {
	    if (stack.isEmpty()) return;
		long pop = stack.pop();
		if (pop < 0) {//如果当前值是负数那么，就意味着在这个值的时候进行了min的转换，需要把之前的min转换回去
			min = min - pop;//之前的min值就是用现在的min-pop
		}
	}

	public int top() {
		long peek = stack.peek();
		if (peek > 0) {
			return (int) (peek + min);//如果是正数，那么就最小值与差值相加
		} else {
			return (int) min;//如果是负数那么，当前值就是最小值
		}
	}

	public int getMin() {
		return (int) min;
	}
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
