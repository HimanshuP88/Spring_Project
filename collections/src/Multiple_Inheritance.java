interface inter1 {
    default void display(){
        System.out.println("inter1");
    }
}
interface child1 extends inter1{
    default void display(){
        System.out.println("child1");
    }
}
interface child2 extends inter1{
    default void display(){
        System.out.println("child2");
    }
}
//class ques_3 implements child1,child2{
//
//
//    @Override
//    public void display() {
//
//            System.out.println("everything done");
//    }
//
//    }

public class Multiple_Inheritance implements child1,child2{
    public void display(){
        System.out.println("default method in multiple_inheritance class");
    }
    public static void main(String args[]){
        Multiple_Inheritance defaultMethods=new Multiple_Inheritance();
        defaultMethods.display();


    }
}