interface DemoInterface {
    String myMethod(char [] chars);
}
public class example{
    public static void main(String[] args) {
        DemoInterface demoInterface = String::new;
        String str=demoInterface.myMethod(new char[]{'a', 'b', 'c', 'd'});
        System.out.println(str);
    }
}


