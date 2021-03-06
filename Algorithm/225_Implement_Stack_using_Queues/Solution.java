class MyStack {
    // Push element x onto stack.
    Queue<Integer> queue = new LinkedList<>();
    
    public void push(int x) {
        int size = queue.size();
        queue.offer(x);
        for (int i = 1; i <= size; i++) {
            queue.offer(queue.poll());
        }
    }

    // Removes the element on top of the stack.
    public void pop() {
        queue.poll();
    }

    // Get the top element.
    public int top() {
        return queue.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return queue.isEmpty();
    }
}
