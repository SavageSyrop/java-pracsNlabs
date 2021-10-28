import java.util.ArrayList;
import java.util.Collection;

public class testClass {
    public static void main(String[] args) {

        Collection<Integer> arr = new ArrayList<>(5);
        arr.add(0);
        arr.add(-1);
        arr.add(-2);
        arr.add(-3);
        arr.add(-4);
        WaitList<Integer> lst = new WaitList<Integer>(arr);
        System.out.println(lst.toString());
        System.out.println(lst.containsAll(arr));
        System.out.println(lst.contains(5));
        System.out.println(lst.isEmpty());
        lst.add(6);
        arr.add(2);
        System.out.println(lst.containsAll(arr)+"\n");



        BoundedWaitList<Integer> list = new BoundedWaitList<Integer>(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println("Элементов в списке: " + list.getCapacity());
        System.out.println(list.toString() + "\n");

        UnfairWaitList<Integer> unlist = new UnfairWaitList<Integer>();
        unlist.add(7);
        unlist.add(8);
        unlist.add(9);
        unlist.add(10);
        unlist.add(11);
        unlist.remove(8);
        unlist.moveToBack(7);
        System.out.println(unlist.toString());





    }
}
