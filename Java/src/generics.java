import java.util.ArrayList;
import java.util.List;

public class generics {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(10);
        list.add("10");
        System.out.println(list);

        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("ankit");
        System.out.println(list1);
    }

}