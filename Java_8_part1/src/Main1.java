import java.sql.SQLOutput;

public class Main1 {
    public static void main(String args[]){
        EmployeeFactory empFactory = Employee::new;
        Employee emp=empFactory.getEmp("himanshu",22);
        System.out.println(emp.name+""+emp.age);
    }
}
