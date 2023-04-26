import java.util.*;
class Circle
{
    static float PI=22/7;
    public static void main(String[] args)
    {
        int option;
        double radius, circum, area;
        Scanner sc=new Scanner (System.in);
        System.out.println("MENU");
        System.out.println("1.Calculate Area of Circle");
        System.out.println("2.Calculate the circumference of Circle");
        System.out.println("3.Exit");
        System.out.print("Choose an option from 1-3");
        option=sc.nextInt();
        switch(option)
        {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                radius=sc.nextDouble();
                area=(PI*(radius*radius));
                System.out.print("The area of the circle is: "+area);
                break;
            case 2:
                System.out.print("Enter the radius of the circle: ");
                radius=sc.nextDouble();
                circum=PI*(2*radius);
                System.out.print("The circumference of the circle is: "+circum);
                break;
            case 3:
                System.out.println("No Solution");
                break;
            default:System.out.println("invalid choice!");
        }
    }
}