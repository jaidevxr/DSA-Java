import java.util.*;
public class set {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(45);
        set.add(12);
        set.add(23);    
        set.add(67);
        set.add(89);
        System.out.println(set);
        set.remove(23);
        System.out.println(set);
        System.out.println(set.size()); 
    }
}
