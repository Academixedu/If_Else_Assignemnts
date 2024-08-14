
import java.util.Scanner;

public class ScoreCard{
// Complete Your Code Here
  // Use Scanner
  // Use && Operator
  // Use Operators >= && <=
  // ID Name Score 
  // Calculate Grade and Print Grade
  public static void main(String[] args) {
     Scanner t=new Scanner(System.in);
     System.out.print("enter your name");
     String name=t.next();
     System.out.print("enter your id");
     long id=t.nextLong();
     System.out.print("enter your marks");
     int marks=t.nextInt();
    if (marks>=240 && marks<=300){
      System.out.println("first rank grade A");
    }
    else if(marks>=150 && marks<240){
      System.out.println("second rank grade B");
    }
    else if(marks>=75 && marks<150){ 
      System.out.println("fail");
    }
 System.out.print("name of the student"+name);
    System.out.println(marks);

}
}
