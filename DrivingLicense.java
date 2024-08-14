import java.util.Scanner;

public class DrivingLicense{
 public static void main(String[] args) {
        Scanner driving=new Scanner(System.in);
        System.out.println("Enter the full name ");
        String name=driving.nextLine();
        System.out.println("enter the age ");
        int age=driving.nextInt();
        System.out.println("Enter the age");
        char gender=driving.next().charAt(1);


        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);


        if (age>=18){
            System.out.println("you are eligible");
        }
        else{
            System.out.println("you are no eligible");
        }

       





    
    }
}
