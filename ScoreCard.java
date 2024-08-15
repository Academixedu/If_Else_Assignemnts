import java.util.Scanner;

public class ScoreCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter full name:");
        String fullName = sc.nextLine();
        System.out.println("Enter class:");
        int studentClass = sc.nextInt();
        System.out.println("Enter English Marks:");
        byte englishMarks = sc.nextByte();
        System.out.println("Enter Maths Marks:");
        byte mathsMarks = sc.nextByte();
        System.out.println("Enter Science Marks:");
        byte scienceMarks = sc.nextByte();

        int totalMarks = englishMarks + mathsMarks + scienceMarks;
        float averageMarks = totalMarks / 3.0f;

        System.out.printf("Average Marks: %.2f%%\n", averageMarks);

        if (averageMarks > 65 && averageMarks <= 100) {
            System.out.println("Pass with First Grade A");
        } else if (averageMarks > 45 && averageMarks <= 65) {
            System.out.println("Pass with Second Grade B");
        } else if (averageMarks >= 35 && averageMarks <= 45) {
            System.out.println("Pass with Third Grade C");
        } else if (averageMarks < 35) {
            System.out.println("You have failed");
        }

        sc.close();
    }
}
