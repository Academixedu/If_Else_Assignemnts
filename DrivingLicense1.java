import java.util.Scanner;

public class DrivingLicense1 {
    public static void main(String[] args) throws Exception {
        Scanner nn = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = nn.nextInt();

        if (age >= 18 && age < 70) {
            System.out.println("You're eligible for a driving license.");
        } else if (age < 18 && age > 0) {
            System.out.println("You're not eligible for a driving license. Wait until you're 18.");
        } else if (age >= 70 && (age == 70 || age == 71)) {
            System.out.println("You may be eligible, but you might need to pass additional health checks.");
        } else if (age > 71) {
            System.out.println("You may need to pass health checks to renew your license.");
        } else {
            System.out.println("Invalid age entered.");
        }
    }
}