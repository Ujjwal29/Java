package Stacks;

//Stacks can be used using Linked lists as well as using arrays.
//below is the implementation using linked lists.
public class LinkedStackOfStrings {
    
    private Node first = null;
    
    private class Node //inner class(kind of structure in C)
    {
        String item;
        Node next;
    }
    
    public boolean isEmpty()
    { return first == null; }
    
    public void push(String item)
    {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
    }
    
    public String pop()
    {
        if(first == null)
        {
            return "";
        }
        else
        {
            String item = first.item;
            first = first.next;
            return item;
        }
    }
    
    public static void main(String[] args) {
        LinkedStackOfStrings ab = new LinkedStackOfStrings();
        System.out.println(ab.isEmpty());
        ab.push("Ujjwal");
        ab.push("Jain");
//        ab.push("mikku");
//        ab.push("Jain");
        String s = ab.pop();
        System.out.println(s);
        System.out.println(ab.isEmpty());
    
    }
}
