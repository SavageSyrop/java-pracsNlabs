import java.util.Iterator;

public class BoundedWaitList<E> extends WaitList<E>{
    private int capacity;
    BoundedWaitList(int capacity)
    {
        this.capacity=capacity;

    }

    public int getCapacity() {
        return capacity;
    }

    public void add(E element)
    {
        if (content.size()<capacity)
        {
            super.add(element);
        }
        else
        {
            System.out.println("Нет места");
        }
    }

    public String toString()
    {
        String ret = "";
        Iterator<E> i = content.iterator();
        while(i.hasNext())
        {
            ret = ret + ' ' + i.next();


        }
        ret = ret + "\n capacity: " + capacity;
        return ret;
    }

}
