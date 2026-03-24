package datastructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedQueue;

import oopmodeling.Planet;

public class BuiltinDataStructure {
	
	public static void main(String[] args) {
		//create two objects of class {@link Planet}
		Planet planet1 = new Planet();
		Planet planet2 = new Planet(123, "Mars");
		//Create a object of array with a fixed size of 5
		Planet[] pls = new Planet[5];
		
		pls[0] = planet1;
		pls[1] = planet1;
		//Create an object of class {@link Planet}
		ArrayList<Planet> planets = new ArrayList<>();
		//Add an object to position 0
		planets.add(planet1);
		//Add an object to position 1
		planets.add(planet2);
		//Retrieve the value at position at index
		planets.get(1);
		//Create an object of class {@link Planet}
		LinkedList<String> name = new LinkedList<>();
		name.add("Pablo");
		name.add("Justo");
		//Less efficient than accessing elements in an array when using index
		name.get(1);
		
		Stack<Integer> callstack = new Stack<>();
		//Add an element on the top of the stack
		callstack.push(34);
		callstack.push(10);
		callstack.push(2);
		//Peek method is used to read the element on top of the stack without eliminating it
		System.out.println(callstack.peek());
		//remove the element from the top of the stack
		System.out.println(callstack.pop());
		//
		System.out.println(callstack.peek());
		
		Queue<Integer> queue = new ConcurrentLinkedQueue<>();
		queue.add(123);
		queue.add(13);
		queue.add(12300);
		System.out.println(queue.poll());
	}

}
