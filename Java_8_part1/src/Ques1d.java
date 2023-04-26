interface myInterface3{
    String upperCase(String x);
}
public class Ques1d {
    public static void main(String[]args){
        myInterface3 demo = (x)->{
            return x.toUpperCase();
        };
        System.out.println(demo.upperCase("himanshu panchal"));
    }
}