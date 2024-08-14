import java.util.Scanner;

public class ScoreCard{
  
  // Complete Your Code Here
  // Use Scanner
  // Use && Operator
  // Use Operators >= && <=
  // ID Name Score 
  // Calculate Grade and Print Grade
  public static void main(String[] args){
    int id;
    String name;
    double Score;
    ScoreCard SC=new ScoreCard();
    Scanner in=new Scanner(System.in);
    System.out.println("enter id");
    id=in.nextInt();
    System.out.println("enter name");
    name=in.nextLine();
    in.nextLine();
    System.out.println("enter Score");
    Score=in.nextDouble();
     
       if( Score>=90 && Score<=100){
      System.out.println("A grade");
     }
     else if(Score>=80 && Score<=90){
      System.out.println("B grade");
     }
     else if(Score>=75 && Score<=80){
      System.out.println("C grade");
     }
     else if(Score<=75){
      System.out.println("fail");
     }
     
  }
}






  

