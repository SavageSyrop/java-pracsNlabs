import java.util.Iterator;

public class UnfairWaitList<E> extends WaitList<E>{

    public UnfairWaitList()
    {

    }

    public void remove(E element)
    {
        Iterator<E> i = content.iterator();
        while(i.hasNext())
        {
            if (i.next()==element)
            {
                i.remove();
                break;
            }
        }
    }

    public void moveToBack(E element)
    {
        Iterator<E> i = content.iterator();
        while(i.hasNext())
        {
            if (i.next()==element)
            {
                content.add(element);
                i.remove();
                break;
            }
        }
    }

}


