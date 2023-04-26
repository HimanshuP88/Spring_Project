public class Quadratic {
    int a,b,c;
    double desc;

    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
    public int getC() {
        return c;
    }

    public void setA(int A){
        a = A;
    }
    public void setB(int B){
        b = B;
    }
//    public void setC(int C ){
//            c = C;


    public double quad() {
        desc = b*2 -(4*a*c);
        return desc;
    }
}

