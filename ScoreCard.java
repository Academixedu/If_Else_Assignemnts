import java.util.*;
public class ScoreCard{
// Complete Your Code Here
  // Use Scanner
  // Use && Operator
  // Use Operators >= && <=
  // ID Name Score 
  // Calculate Grade and Print Grade
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("En1
    ter id");
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


