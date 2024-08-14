import java.util.Scanner;

public class DrivingLicense{
// Complete Your Code Here
    public static void main(String[] args) {
        Scanner lu=new Scanner(System.in);
    System.out.println("enter your age");
    int age=lu.nextInt();

        if(age>=18 ){
            System.out.println("you are passed your test");
}
        else if (age>=18 ) {
             System.out.println("your failed your test");
}
        else if(age<18){
            System.out.println("your not eligable");
        }
}
}
