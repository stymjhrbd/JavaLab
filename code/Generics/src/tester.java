class tester {
	public static void main(String[] args) {
		MyStack<Integer> myStack = new MyStack<>();
		
		myStack.push(50);
		myStack.push(40);
		myStack.push(5);
		myStack.push(505);
		myStack.push(10);
		
		myStack.pop();
		myStack.peek();
		myStack.pop();
		myStack.peek();
		myStack.pop();
		myStack.peek();
		myStack.pop();
		myStack.peek();
	}
}