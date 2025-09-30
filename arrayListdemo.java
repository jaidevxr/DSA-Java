import java.util.ArrayList;
public class arrayListdemo {
    // public static void main(String[] args) {
    //     ArrayList<String> list = new ArrayList<>();
    //     list.add("java");
    //     list.add("python");
    //     list.add("c++");
    //     System.out.println(list);
    //     list.add(1,"c");
    //     System.out.println(list);
    //     System.out.println(list.get(2));
    //     list.set(0,"Django");
    //     System.out.println(list);
    //     list.remove("Django");
    //     System.out.println(list);

    // }
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");              
        list.add("banana");
        list.add("grapes");
        System.out.println(list);
        list.add(1, "orange");
        System.out.println(list);
        System.out.println(list.get(2));
        list.set(0, "kiwi");
        System.out.println(list);
        list.remove("banana");
        System.out.println(list);
        System.out.println(list.size());
        

    }    
    
}
