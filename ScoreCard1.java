import java.util.Scanner;
public class ScoreCard1 {
    public static void main(String[] args) throws Exception {
        Scanner nn= new Scanner(System.in);
        System.out.println("Enter your score");
        float num= nn.nextFloat();
        if (num>=26 && num<30){
        System.out.println("youre an avarege student bro...");
    } else if (num<26 && num>0 ){
        System.out.println("you faild bro dont worry try next time ...");
    }  else if (num>=30 && num<40){
        System.out.println("youre doing good try more...");
    }else if (num>=40 && num<70){
        System.out.println("well youre  a hard worker...");
    }else if (num>=70 && num<74){
        System.out.println("well done ...");
    }else if (num==74 || num==75){
        System.out.println("well nerd youre first in class ...");
    }
}
}
