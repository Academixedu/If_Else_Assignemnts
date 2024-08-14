import java.util.Scanner;

public class ScoreCard{
  public static void main(String[] args) {
    Scanner score=new Scanner(System.in);
    System.out.println("Enter the full name");
    String name=score.nextLine();
    System.out.println("enter the class");
    int Class=score.nextInt();
    System.out.println("physic marks");
    int physic=score.nextInt();
    System.out.println("chemistry marks");
    int chemistry=score.nextInt();
    System.out.println("maths marks");
    int maths=score.nextInt();

    int add=physic+maths+chemistry;
    // float score1=;
    float score2=add/3;
    System.out.println(score2+"%");

    if (score2>65 && score2<=100){
          System.out.println("pass with first grade A");
    }
    else if (score2>45 && score2<=65) {
         System.out.println("pass with second grade B");
    }
    else if (score2>=35 && score2<=45) {
      System.out.println("pass with third grade  C");
      
    }
     else if (score2!=35 && score2<35) {
      System.out.println("you are failed");
      
     }{
       
     }


  }

}
