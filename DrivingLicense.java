import java.util.Scanner;

public class DrivingLicense{
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.print("enter your name");
    String name=s.next();
    System.out.print("enter your age");
int age=s.nextInt();


    
    if(age>=18){
        System.out.println("your eligible for license");
        
    }
    else{
        System.out.println("you are not enligible for license");
    }
}
}
