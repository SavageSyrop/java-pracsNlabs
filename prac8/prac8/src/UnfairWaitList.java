import java.util.Iterator;

public class UnfairWaitList<E> extends WaitList<E>{

    public UnfairWaitList()
    {

    }

    public void remove(E element)
    {

        Iterator<E> i = content.iterator();
        if (i.next()== element)
        {
            System.out.println(element + " это первый элемент списка, его нельзя удалить, передвигаю его в конец");
            content.add(element);
            i.remove();
            return;
        }

        while(i.hasNext())
        {
            if (i.next()==element)
            {
                if (!(deleted.contains(element)))
                    deleted.add(element);

                i.remove();
                break;
            }
        }
    }

    public void moveToBack(E element)
    {
        if (deleted.contains(element))
        {
            System.out.println("Элемент " + element + " был удален и не может быть добавлен");
        }
        else {
            content.add(element);
        }
    }

}


