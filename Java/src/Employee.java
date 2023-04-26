public class Employee

{

    private String firstName;

    private String lastName;

    private double salary;

    public Employee()

    {

        firstName = "";

        lastName = "";

        salary = 0;

    }

    public Employee (String firstName, String lastName)

    {

        this.firstName = firstName;

        this.lastName = lastName;

        this.salary = 0;

    }

    public Employee( String firstName, String lastName, double s)

    {

        this.firstName = firstName;

        this.lastName = lastName;

        setSalary( s );

    }

    public String getFirstName()

    {

        return this.firstName;

    }

    public String getLastName()

    {

        return this.lastName;

    }

    public double getSalary()

    {

        return this.salary;

    }

    public void setFirstName( String firstName)

    {

        this.firstName = firstName;

    }

    public void setLastName ( String lastName)

    {

        this.lastName = lastName;

    }

    public void setSalary( double salary)

    {

        if (salary < 0 ) this.salary = 0;

        else this.salary = salary;

    }

    public String toString()

    {

        return "First_Name="+firstName + "\n"  +"Last_NAME="+ lastName + "\n" +"Salary="+salary;

    }
    public static void main(String args[])
    {
        Employee emp=new Employee("Himanshu","panchal",30000);
        emp.getFirstName();
        emp.getLastName();
        emp.getSalary();
        emp.setFirstName(emp.firstName);
        emp.setLastName(emp.lastName);
        emp.setSalary(emp.salary);
        String info=emp.toString();
        System.out.println(info);
    }
}
