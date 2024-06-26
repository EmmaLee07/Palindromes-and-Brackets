import java.util.LinkedList;

public class MyStack <E> implements Stack<E>{
    private LinkedList<E> list;
    private int size;
    public MyStack() {
        list = new LinkedList<E>();
        size = 0;
    }

    /**
     *	Return the Object on the top of the Stack
     *	If the Stack is empty, return null
     */
    public E peek()
    {
        if(list.size() ==0)
        {
            return null;
        }
        else {
            return list.get(0); 
        }
    }

    /**
     *	Add item to the top of the Stack
     */
    public void push(E item)
    {
        size++;
        list.add(0,item);
    }

    /**
     *	Remove the Object from the top of the Stack and return it
     *	If the Stack is empty, return null
     */
    public E pop()
    {
        if(list.size() ==0)
        {
            return null;
        }
        else {
            size--;
            return list.remove(0);
        }
    }

    /**
     *	Return true is this Stack is empty
     */
    public  boolean isEmpty()
    {
        return size == 0;
    }

    /**
     *	Return the number of Objects that are in this Stack
     */
    public int size()
    {
        return size;
    }
}

