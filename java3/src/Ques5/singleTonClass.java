package Ques5;

 class singletonClass {
    public static void main(String[] args){
        Ques5 object = Ques5.getInstance();
        object.lightOn();
        object.lightOff();
    }
}
