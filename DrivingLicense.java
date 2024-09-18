public class DrivingLicense{
    public static void main(String[] args){
        int age = 18;
        String drivingtest = "PASS";
        if(age >= 18 && drivingtest.equals("PASS") ){
            System.out.println("Eligible for drivinglicense");
        }else if (age <= 18 && drivingtest != "PASS") {
            System.out.println("Not Eligible for drivinglicense");
            
        }


    }

}
