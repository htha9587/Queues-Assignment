package QueuesPackage;

import java.util.*;
import QueuesPackage.*;

/**
 * Version 0.1
 * @author Harrison
 *3-25-16
 */


public class QueueController 
{

	/**
	 * Main method that uses seven random integers.
	 * @param args
	 */
	
	public static void main(String [] args)
	{
		//Natural order of priority queue.
		Queue<Integer> integerPriorityQueue = new PriorityQueue<>(7);
		Random rand = new Random();
		for(int total=0;total<7;total++)
		{
		integerPriorityQueue.add(new Integer(rand.nextInt(100)));
		}
		for(int total=0; total<7; total++)
		{
			Integer in = integerPriorityQueue.poll();
			System.out.println("Processing Integer:" + in);
		}
	}
	
	public void start()
	
	{
		/**
		 * Uses iterator and for loop.
		 */
		Queue queueA = new LinkedList();
		queueA.add("hasOrder");
		queueA.add("name");
		queueA.add("total");
		
		//access via an iterator.
		Iterator iterator = queueA.iterator();
		while(iterator.hasNext())
		{
			String element = (String) iterator.next();
		}
		
		//access via a new for loop.
		for(Object customerObject : queueA)
		{
			String element = (String) customerObject;
		}
		
		Object firstElement = queueA.remove();
		System.out.println("I have three things in my Queue, a boolean, a String, and a double!");
	}
	
	
}
