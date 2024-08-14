import java.util.Scanner;
public class ScoreCard{
  public static void main(String[] args) {
    int id;
    double score;
    String name;
    ScoreCard sc=new ScoreCard();
    Scanner scanner=new Scanner(System.in);
    System.out.println("enter student id");
    id=scanner.nextInt();
    System.out.println("enter student name");

    name=scanner.nextLine();
    scanner.nextLine();
    System.out.println("enter score");
    score=scanner.nextDouble();
    if(score>=90 && score<=100){
      System.out.println("A grade");
    }
    else if(score>=75 && score<90){
        System.out.println("B grade");
    }
    else if(score>=50 && score<75){
        System.out.println("C grade");
    }
    else if(score>=35 && score<50){
        System.out.println("D grade");
    }
    else{
        System.out.println("fail");
    }
  }
}