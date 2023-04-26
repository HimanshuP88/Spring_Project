interface add{
    int add(int a,int b);

}
public class additin {
    public static void main(String args[]){
        add add1=(a,b)->(a+b);
        System.out.println(add1.add(45,45));
    }
}
