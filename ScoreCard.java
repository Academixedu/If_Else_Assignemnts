package If_Else_Assignemnts;

public class ScoreCard {
  // Complete Your Code Here
  // Use Scanner
  // Use && Operator
  // Use Operators >= && <=
  // ID Name Score
  // Calculate Grade and Print Grade

  public static void main(String[] args) {
    java.util.Scanner sc = new java.util.Scanner(System.in);
    System.out.println("Enter ID: ");
    int id = sc.nextInt();
    System.out.println("Enter Name: ");
    String name = sc.next();
    System.out.println("Enter Score: ");
    double score = sc.nextDouble();
    if (score >= 90 && score <= 100) {
      System.out.println("The Grade for " + name + " is A");
    } else if (score >= 80 && score < 90) {
      System.out.println("The Grade for " + name + " is B");
    } else if (score >= 70 && score < 80) {
      System.out.println("The Grade for " + name + " is C");
    } else if (score >= 60 && score < 70) {
      System.out.println("The Grade for " + name + " is D");
    } else {
      System.out.println("The Grade for " + name + " is F");
    }
  }
}
