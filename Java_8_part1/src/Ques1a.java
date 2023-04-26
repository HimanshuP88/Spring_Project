interface Demo{
    boolean compare(int x, int y);
}
public class Ques1a {
    public static void main(String[] args) {
        Demo demo = (x,y)->{
            if (x<y){
                return true;
            }
            return false;
        };
        System.out.println(demo.compare(12,23));
    }
}