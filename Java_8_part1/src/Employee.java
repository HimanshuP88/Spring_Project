interface EmployeeFactory{
    public abstract Employee getEmp(String name,Integer age);

}

public class Employee {
    String name;
    Integer age;
    public Employee(String name,Integer age){
        this.name=name;
        this.age=age;

    }
    public void check(){
        System.out.println("check");
    }
}
