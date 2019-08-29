package algorithm;

public class Stack {

	public static void main(String[] args) throws Exception {
		// LIFO (Last In First Out)
		// 
		Stacks<Integer> s = new Stacks<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.isEmpty());
		System.out.println(s.pop());
		System.out.println(s.isEmpty());
	}

}

class Stacks<T>{
	class Node<T>{
		
		private T data;
		private Node<T> next;
		
		public Node(T data) {
			this.data = data;
		}
	}
	
	private Node<T> top;
	
	public T pop() throws Exception {
		if(top == null) {
			 throw new Exception();
		}
		
		T item = top.data;
		top = top.next;
		return item;
	}
	
	public void push(T item) {
		Node<T> t = new Node<T>(item);
		t.next = top;
		top = t;
	}
	
	public T peek() throws Exception {
		if(top == null) {
			throw new Exception();
		}
		
		return top.data;
	}

	public boolean isEmpty() {
		return top == null;
		}
		
}
