public class DrivingLicense {
    public static void main(String[] args) {
        int age = 17;
        if (age >= 18 && age <= 60) {
            System.out.println("You are eligible for Driving License");
        } else if (age < 18) {
            System.out.println("You are not eligible for Driving License");
        } else {
            System.out.println("You are not eligible for Driving License as you are above 60");
        }
    }

}
