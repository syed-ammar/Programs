package com.syed.linkedlist;

/**
 * @author sammar
 *
 */
public class LinkedNode {
	private int value;
	public LinkedNode next;
	
	public LinkedNode(int value, LinkedNode next) {
		super();
		this.value = value;
		this.next = next;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LinkedNode [value=" + value + "]";
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * @return the next
	 */
	public LinkedNode getNext() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(LinkedNode next) {
		this.next = next;
	}
}
