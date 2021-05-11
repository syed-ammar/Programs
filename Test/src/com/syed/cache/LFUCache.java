package com.syed.cache;

import com.syed.linkedlist.DoublyLinkedNode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LFUCache
{
    private static final int MAX_CAPACITY = 4;
    private final Map<String, DoublyLinkedNode> cache = new HashMap<>();
    private final DoublyLinkedNode freqHead = new DoublyLinkedNode("F", 0);

    public void put(String key, String value)
    {
        if (cache.containsKey(key))
        {
            DoublyLinkedNode node = cache.get(key);
            updateFrequency(node, node.getFrequency(), node.getFrequency() + 1);
            node.setFrequency(node.getFrequency() + 1);
        }
        else if (cache.size() == MAX_CAPACITY)
        {
            evictFromCache();
            DoublyLinkedNode node = new DoublyLinkedNode(key, 1);
            updateFrequency(node, node.getFrequency(), node.getFrequency());
            cache.put(key, node);
        }
        else
        {
            DoublyLinkedNode node = new DoublyLinkedNode(key, 1);
            updateFrequency(node, node.getFrequency(), node.getFrequency());
            cache.put(key, node);
        }
    }

    public String get(String key) throws Exception
    {
        if (!cache.containsKey(key))
            throw new Exception("Key not found");

        DoublyLinkedNode node = cache.get(key);
        updateFrequency(node, node.getFrequency(), node.getFrequency() + 1);

        return node.getValue();
    }

    private String evictFromCache()
    {
        DoublyLinkedNode firstFreqNode = freqHead.next;
        String keyToRemove = null;
        if (firstFreqNode.getKeys().size() > 0)
        {
            Iterator<String> setIterator = firstFreqNode.getKeys().iterator();
            while (setIterator.hasNext())
            {
                keyToRemove = setIterator.next();
                setIterator.remove();
                break;
            }
            cache.remove(keyToRemove);
        }

        if (firstFreqNode.getKeys().size() == 0)
        {
            removeNode(firstFreqNode);
        }
        return keyToRemove;
    }

    private void removeNode(DoublyLinkedNode firstFreqNode)
    {
        firstFreqNode.prev.next = firstFreqNode.next;
        firstFreqNode.next.prev = firstFreqNode.prev;
    }

    private void updateFrequency(DoublyLinkedNode node, int currFrequency, int nextFrequency)
    {
      /* Case 1 :
          1. Get the parent from the node which will give the freq node
          2. if parent is null
          3. check if freq node for 1 exists ,if not, create freq node with freq 1
          4. Add key to the set of freq node
          5. Update the parent of current node

         Case 2 :
           1. Get the parent from the node which will give the freq node
           2. remove the key from the curr freq node
           3. Check if node with next freq exists, if not create one with nextFreq
           4. Add key to the set of freq nodes
           5. Update the parent of current node with new freq
       */
        DoublyLinkedNode currFreqNode = node.parent;
        DoublyLinkedNode nextFreqNode = null;
        if (currFreqNode == null)
        {
            if (freqHead.next.getFrequency() != 1)
            {
                DoublyLinkedNode tmp = new DoublyLinkedNode("F", 1);
                tmp.next = freqHead.next;
                freqHead.next.prev = tmp;
                tmp.prev = freqHead;
                freqHead.next = tmp;
                node.parent = tmp;
                tmp.getKeys().add(node.getValue());
            }
            else
            {
                freqHead.next.getKeys().add(node.getValue());
                node.parent = freqHead.next;
            }
        }
        else
        {
            currFreqNode.getKeys().remove(node.getValue());
            if (currFreqNode.next.getFrequency() != nextFrequency)
            {
                DoublyLinkedNode tmp = new DoublyLinkedNode("F", nextFrequency);
                tmp.next = currFreqNode.next;
                currFreqNode.next.prev = tmp;
                currFreqNode.next = tmp;
                tmp.prev = currFreqNode;
                node.parent = tmp;
                tmp.getKeys().add(node.getValue());
            }
            else
            {
                nextFreqNode = currFreqNode.next;
                nextFreqNode.getKeys().add(node.getValue());
                node.parent = nextFreqNode;
            }

        }
    }
}
