import java.util.*;

class demo {

    public void add(int a, int b) {
        System.out.println(a + b);
    }
    public void sub(int a,int b){
        System.out.println(a - b);

    }
}

    public class Main{


        public static void main(String[] args) {
            demo d1 = new demo();
            Scanner sc = new Scanner(System.in);


            int a = sc.nextInt();
            int b = sc.nextInt();
            d1.add(a,b);
        }
    }
