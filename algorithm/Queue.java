package algorithm;

import java.util.NoSuchElementException;

public class Queue {

	public static void main(String[] args) {
		// FIFO (First In First Out)
		Queues<Integer> s = new Queues<Integer>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		System.out.println(s.remove());
		System.out.println(s.remove());
		System.out.println(s.peek());
		System.out.println(s.remove());
		System.out.println(s.isEmpty());
		System.out.println(s.remove());
		System.out.println(s.isEmpty());
	}
	
	

}

class Queues<T>{
	
	class Node<T>{
		private T data;
		private Node<T> next;
		
		public Node(T data) {
			this.data = data;
		}
	}
	
	private Node<T> first;
	private Node<T> last;
	
	public void add(T item) {
		Node<T> t = new Node<T>(item);
		
		if(last != null) {
			last.next = t;
		}
		last = t;
		if(first == null) {
			first = last;
		}
	}
	
	public T remove() {
		if(first == null) {
			throw new NoSuchElementException();
		}
		
		T data = first.data;
		first  = first.next;
		
		if(first == null) {
			last = null;
		}
		
		return data;
	}
	
	public T peek() {
		if(first == null) {
			throw new NoSuchElementException();
		}
		return first.data;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
}
