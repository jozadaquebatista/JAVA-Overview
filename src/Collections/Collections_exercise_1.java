import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        
        ArrayList<String> brands = new ArrayList<>();
        brands.add("Amazon");
        brands.add("Microsoft");
        brands.add("Oracle");
        brands.add("IBM");    
        brands.add("HP");
        brands.add("Apple");
        brands.add("Coca-cola");
        
        TreeSet<String> brands2 = new TreeSet<>();
        brands2.addAll(brands);
        
        System.out.println(brands2);        
        System.out.println(brands2.descendingSet());
        
        System.out.println(brands2.first());
        System.out.println(brands2.last());
        
        System.out.println(brands2.headSet("IBM", true));
        System.out.println(brands2.tailSet("IBM", false));
        System.out.println(brands2.subSet("Apple", true, "Coca-cola", true));        
    }
}
