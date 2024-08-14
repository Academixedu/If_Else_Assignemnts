import java.util.*;
public class ScoreCard{
       // Complete Your Code Here
         // Use Scanner
         // Use && Operator
         // Use Operators >= && <=
         // ID Name Score 
         // Calculate Grade and Print Grade
         public static void main(String[] args0){
         Scanner sc=new Scanner(System.in);
           int id = sc.nextInt();
           String name = sc.next();
           int score = sc.nextInt();
           if(score<=20)
            System.out.println("F");
           else if( score>=20 && score<40)
             System.out.println("D");
           else if(score>=40 && score<50)
                  System.out.println("C");
           else if(score>=50 && score<75)
                  System.out.println("B");
           else if(score>=75 && score<99)
                  System.out.println("A");
           else if(score==99 || score==100)
                   System.out.println("S");
         
         else
         System.out.println("no score founded");
       }
       
             
        
           
       }
       
