
import java.util.HashMap;
import java.util.Map;

/*
Problem: LRU Cache

Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.

🧾 Requirements

Implement the LRUCache class:

class LRUCache {
    LRUCache(int capacity)
    int get(int key)
    void put(int key, int value)
}
📌 Behavior
1. get(key)
If key exists → return value
Else → return -1
Accessing a key makes it most recently used
2. put(key, value)
Insert or update key
If key exists → update value and mark as most recently used
If capacity is exceeded:
👉 Remove the least recently used key
🎯 Constraints
get → O(1)
put → O(1)
🧠 Example
LRUCache lru = new LRUCache(2);

lru.put(1, 1);   // cache = {1=1}
lru.put(2, 2);   // cache = {1=1, 2=2}

lru.get(1);      // returns 1 → cache = {2=2, 1=1}

lru.put(3, 3);   // evicts key 2 → cache = {1=1, 3=3}

lru.get(2);      // returns -1

lru.put(4, 4);   // evicts key 1 → cache = {3=3, 4=4}

lru.get(1);      // -1
lru.get(3);      // 3
lru.get(4);      // 4
*/

// Solution: Use HashMap to store a key and values, and a doubly linked list to maintain the order of the keys based on their usage. The most recently used key will be moved to the head of the list, while the least recently used key will be at the tail. When the capacity is exceeded, we can easily remove the tail node from the list and delete its corresponding entry from the HashMap.

class LRUNode{
    int key;
    int value;
    LRUNode prev;
    LRUNode next;

    public LRUNode(int key,int value){
        this.key=key;
        this.value=value;
    }
}
public class LRUCache {
    private int capacity;
    private Map<Integer,LRUNode> LRUMap;
    private LRUNode head;
    private LRUNode tail;
    public LRUCache(int capacity){
        this.capacity=capacity;
        LRUMap=new HashMap<>();
        head=new LRUNode(-1,-1);
        tail=new LRUNode(-1,-1);
        head.next=tail;
        tail.prev=head;
    }

    private void removeNode(LRUNode node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }

    private void addToFront(LRUNode node){
        node.next=head.next;
        node.prev=head;
        head.next.prev=node;
        head.next=node;
    }


    public int get(int key){
        if(!LRUMap.containsKey(key)){
            return -1;
        }
        LRUNode node=LRUMap.get(key);
        removeNode(node);
        addToFront(node);
        return node.value;
    }
    
    public void put(int key, int value){
        if(LRUMap.containsKey(key)){
            LRUNode node=LRUMap.get(key);
            node.value=value;
            removeNode(node);
            addToFront(node);
        }
        else{
            if(LRUMap.size()==capacity){
                LRUNode lruNode=tail.prev;
                removeNode(lruNode);
                LRUMap.remove(lruNode.key);
            }
            LRUNode newNode=new LRUNode(key,value);
            addToFront(newNode);
            LRUMap.put(key, newNode);
        }
    }

    public static void main(String[] args) {
        LRUCache lru = new LRUCache(2);

        lru.put(1, 1);   
        lru.put(2, 2);   

        System.out.println(lru.get(1));      

        lru.put(3, 3);   
        System.out.println(lru.get(2));      

        lru.put(4, 4);  

        System.out.println(lru.get(1));     
        System.out.println(lru.get(3));      
        System.out.println(lru.get(4));      
    }
}