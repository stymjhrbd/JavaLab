import java.util.LinkedList;

public class MyStack<T> {

	LinkedList<T> list = new LinkedList<>();

	void push(T val) {
		list.offerLast(val);
	}

	void pop() {
		list.pollLast();
	}
	void peek() {
		System.out.println(list.peekLast());
	}
}

