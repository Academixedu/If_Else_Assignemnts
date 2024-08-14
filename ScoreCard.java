import java.util.Scanner;

public class ScoreCard{
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    
    System.out.println("enter student Name");
    String Name=s.next();
    System.out.println("enter student ID");
    int ID=s.nextInt();
    System.out.println("enter student Score");
    byte score=s.nextByte();
    System.out.println(ID+" "+ Name+" "+score);
    //  score=67;
    
    char grade;
    if (score>=85 && score<=100){
      grade='A';
      System.out.println(grade+":"+"Execllent");
    }
    else if(score<85 &&  score>=65){
      grade='B';
      System.out.println(grade+":"+"Good");
    }
    else if (score<65 &&  score>=35){
      grade='C';
      System.out.println(grade+":"+"Keep working Hard");
    }
    else if(score<35 ){
      grade='f';
      System.out.println(grade+":"+"Failed");
    }
  }

}
