import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E> {
    protected ConcurrentLinkedQueue<E> content;
    protected ArrayList<E> deleted;

    public void add(E element)
    {
        content.add(element);
    }
    public E remove()
    {
        return(content.remove());
    }

    public boolean contains(E element)
    {
        return(content.contains(element));
    }

    public boolean containsAll(Collection<E> c)
    {
        return(content.containsAll(c));
    }
    public boolean isEmpty()
    {
        return(content.isEmpty());
    }
    WaitList()
    {
        content = new ConcurrentLinkedQueue<E>();
        deleted = new ArrayList<E>();
    }
    WaitList(Collection<E> c)
    {
        content = new ConcurrentLinkedQueue<E>();
        deleted = new ArrayList<E>();
        Iterator<E> i = c.iterator();
        while(i.hasNext())
        {
            content.add(i.next());

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
        return ret;
    }

}
