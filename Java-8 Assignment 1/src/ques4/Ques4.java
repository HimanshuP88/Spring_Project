package ques4;

interface constructRef{
    Ques4 message(String s);
}
public class Ques4 {
    Ques4 (String s){
        System.out.println(s);
    }
}