interface Demo{
        void display();
        }
 class ThisDemo{
    Integer myInteger=1;
    public void myMethod(){
        Demo demo=()-> {
            Integer myInteger=2;
            System.out.println(this.myInteger);
        };
        demo.display();
    }
    public static void main(String[] args) {
        new ThisDemo().myMethod();
    }
}
