public class ques3{
    public static void main(String []args){
        try{
            Class.forName("Himanshu");
        }
        catch(ClassNotFoundException abc){
            System.out.println("class not found");
            abc.printStackTrace();
        }
    }
}
