package Stacks;

//Array implementation of stacks
//It requires the client to provide the capacity of the array.
//Considerations:
    /*
    1)Overflow and underflow(pop from an empty stack)
    2)Allow null items to be inserted
    3)Hold a reference to an object when it is no longer needed(loitering).
    */
public class FixedCapacityStackOfStrings {

    private int N=0;
    private String[] s;
    
    public FixedCapacityStackOfStrings(int capacity)
    { s = new String[capacity]; }
    
    public void push(String item)
    { s[N++] = item; }

    public String pop()  //s[N] needs to be null because java doesn't know we are not using it.Since it reamins a pointer to that point.
    {                    //best use of memory
        String item = s[--N];
        s[N] = null;
        return item; 
    }
}
