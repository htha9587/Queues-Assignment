package QueuesPackage;

import QueuesPackage.QueueController;

public class Customer 
{

	private boolean hasOrder;
	private String name;
	private double total;
	
	
	/**
	 * Initializes customer objects.
	 * @param hasOrder
	 * @param name
	 * @param total
	 */
	
	public Customer(boolean hasOrder, String name, double total)
	{
		this.hasOrder = true;
		this.name = name;
		this.total = total;
	}
	/**
	 * Getter for hasOrder.
	 * @return
	 */
	public boolean getHasOrder()
	{
		return hasOrder;
	}
	/**
	 * Getter for name.
	 * @return
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * Getter for total.
	 * @return
	 */
	public double getTotal()
	{
		return total;
	}
}
