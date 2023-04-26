public class Test {
    static String FirstName ;
    static String LastName;
    static int Age;

    static {
        FirstName="Himanshu";
        LastName="Panchal";
        Age=22;
    }

    static void show() {
        System.out.println("First Name="+FirstName+"\n");
        System.out.println("Last Name="+LastName+"\n");
        System.out.println("Age="+Age);

    }

    // static method(main !!)
    public static void main(String[] args)
    {
        Test tt=new Test();
        tt.show();
    }
}
