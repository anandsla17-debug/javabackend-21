package Collection;

import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
public class Stackandqueue {

	
	public void stack() {
		Stack<Integer> ticketbooking=new Stack<Integer>();
		ticketbooking.push(10);
		ticketbooking.push(20);
		ticketbooking.push(30);
	ticketbooking.push(40);
		ticketbooking.push(50);
		ticketbooking.pop();
		System.out.println(ticketbooking.peek());
		System.out.println(ticketbooking);
	}
	
	
	public void Queue() {
	Queue<String> foodordering=new LinkedList<String>();
	foodordering.add("anand");
	foodordering.add("arun");
	foodordering.add("harish");
	foodordering.poll();// first
	foodordering.poll();
	
	System.out.println(foodordering.peek());
	System.out.println(foodordering);
	
	}
	public void main(String[] args) {
		Stackandqueue stackandqueue= new Stackandqueue();
		stackandqueue.stack();
		stackandqueue.Queue();
	}
}
