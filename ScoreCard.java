import java.util.Scanner;

public class ScoreCard{
  @SuppressWarnings("resource")
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter id");
    int id = in.nextInt();
    System.out.println("Enter Name:");
    String name = in.next();
    System.out.println("Enter Score");
    int score = in.nextInt();


     if (score <=100 && score >90) {
      System.out.println("id:"+id+"  "+"Name:" +name+"  "+ "Grade A");      
    }
    else if (score <=90 && score >75) {
      System.out.println("id:"+id+"  "+"Name:" +name+"  "+ "Grade B"); 

    }
    else if (score <=75 && score >65){
      System.out.println("id:"+id+"  "+"Name:" +name+"  "+ "Grade C"); 

    }
    else if(score <=65 && score>40){
      System.out.println("id:"+id+"  "+"Name:" +name+"  "+ "Grade D"); 

    }
    else{
      System.out.println("id:"+id+"  "+"Name:" +name+"  "+ "Fail"); 
    }

  }


}
