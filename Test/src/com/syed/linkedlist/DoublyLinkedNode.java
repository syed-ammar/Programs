package com.syed.linkedlist;

import java.util.LinkedHashSet;
import java.util.Set;

public class DoublyLinkedNode
{
    private String value;
    public DoublyLinkedNode next;
    public DoublyLinkedNode prev;
    public DoublyLinkedNode parent;
    private int frequency;

    private Set<String> keys = new LinkedHashSet<>();

    public DoublyLinkedNode(String value, int frequency)
    {
        this.value = value;
        this.frequency = frequency;
    }

    public String getValue()
    {
        return value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }

    public int getFrequency()
    {
        return frequency;
    }

    public void setFrequency(int frequency)
    {
        this.frequency = frequency;
    }


    public Set<String> getKeys()
    {
        return keys;
    }

    public void setKeys(Set<String> keys)
    {
        this.keys = keys;
    }
}
