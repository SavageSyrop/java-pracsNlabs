import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Solution<T,K,V> {
    private ArrayList<T> arrLst;
    private HashSet<T> hshSet;
    private HashMap<K,V> hshMap;
    Solution()
    {

    }

    public void newArrayList(T obj)
    {
        if (arrLst==null)
        {
            arrLst = new ArrayList<T>();
        }
        arrLst.add(obj);
    }

    public void newHashSet(T obj)
    {
        if (hshSet==null)
        {
            hshSet = new HashSet<T>();
        }
        hshSet.add(obj);
    }

    public void newHashMap(K key, V obj)
    {
        if (hshMap==null)
        {
            hshMap = new HashMap<K,V>();
        }
        hshMap.put(key, obj);
    }

    public void print()
    {

        System.out.println(arrLst.toString());
        System.out.println(hshSet.toString());
        System.out.println(hshMap.toString());

    }

}
