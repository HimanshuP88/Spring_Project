interface myInterface4{
    int methodRef(int x,int y);
}
public class Ques2 {
    static int multi(int x, int y){
        return x*y;
    }
    int sum(int x, int y){
        return x+y;
    }
    int sub(int x, int y){
        return x-y;
    }
    public static void main(String[]args){
        myInterface4 multi = Ques2::multi;
        System.out.println("Multiplication = "+multi.methodRef(4,4));
        myInterface4 sum = new Ques2()::sum;
        System.out.println("addition = "+sum.methodRef(6,5));
        myInterface4 sub = new Ques2()::sub;
        System.out.println("Subtract = "+sub.methodRef(5,2));
    }
}
