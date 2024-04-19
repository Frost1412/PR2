package PR2.old;

public class ArrayStack {
	private String[] stack;
	private int top = -1;
	
	public ArrayStack() {}
	public ArrayStack(int maxSize) {
		stack = new String[maxSize];
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
	public boolean isFull() {
		return top==(stack.length -1);
	}
	
	public void push(String item) {
		if (!isFull()) {
			top++;
			stack[top]=item;
		}
		else {
			System.out.println("Stack is full. Cannot push.");
		}
	}
	public String pop(){
		if (!isEmpty()) {
			String tmp= stack[top]; 
			top--; 
			return tmp;
		}
		else {
			System.out.println("Stack is empty. Cannot pop.");
			return null;
			}	
	}
	public String peek() {
		if (!isEmpty()) {
			return stack[top];
		}
		else {
			System.out.println("Stack is empty.");
			return null;
			}
	}
	
}
