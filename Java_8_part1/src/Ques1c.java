interface myInterface2{
    String concat(String x, String y);
}
public class Ques1c {
    public static void main(String[]args){
        myInterface2 demo = (x,y)->{
            return x+y;
        };
        System.out.println(demo.concat("Himanshu","Panchal"));
    }
}