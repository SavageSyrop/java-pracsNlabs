import java.util.ArrayList;
public class arrayListTest {
    public static void main(String[] args) {

        ArrayList<String> states = new ArrayList<String>();

        states.add("Deutschland");
        states.add("Frankreich");
        states.add("Vereinigtes Königreich");
        states.add("Spanien");
        states.add(1, "Italien");

        for(String state : states){

            System.out.println(state);
        }
        System.out.println();

        System.out.println(states.get(1));
        states.set(1, "Dänemark");

        System.out.printf("В списке %d элементов \n", states.size());
        for(String state : states){

            System.out.println(state);
        }

        System.out.println("\n");

        if(states.contains("Australia")){

            System.out.println("Список содержит государство Австралия");
        }
        else
        {
            System.out.println("Список не содержит государство Австралия");
        }

        System.out.println("\n");

        states.remove("Spanien");
        states.remove(1);
        states.add("Vereinigtes Königreich");
        states.add("Vereinigtes Königreich");

        Object[] countries = states.toArray();
        for(Object country : countries){

            System.out.println(country);
        }

        System.out.println("Страна под индексом 2 " + states.get(2));
        System.out.println("Индекс Frankreich " + states.indexOf("Frankreich"));
        System.out.println("Последнее вхождения Vereinigtes Königreich " + states.lastIndexOf("Vereinigtes Königreich"));
        System.out.println("Размер списка " + states.size());

        states.clear();

        if (states.isEmpty())
        {
            System.out.println("Список пуст");
        }
    }
}