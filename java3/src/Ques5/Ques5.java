package Ques5;

public class  Ques5 {
    private static Ques5 instance = new Ques5();
    private Ques5(){}
    public static Ques5 getInstance(){
        return instance;
    }
    public void lightOn(){
        System.out.println("Light is ON");
    }
    public void lightOff(){
        System.out.println("Light is OFF");
    }
}
