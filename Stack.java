import java.util.Stack;

public class Stack {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Stack<Integer> a=new Stack<>();
		System.out.println("Before inserting valiue"+a.empty());
		
		a.push(10);
		a.push(12);
		a.push(17);
		a.push(50);
		System.out.println("Stack is: "+a);
		System.out.println("After inserting value: "+a.empty());
		System.out.println("Stack is: "+a.pop());
		System.out.println("Stack Peek value is: "+a.peek());
		System.out.println("Stack Search value is at: "+a.search(10));
		

	}

}
