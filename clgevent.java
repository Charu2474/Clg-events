import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner b=new Scanner(System.in);
        System.out.println("Welcome to AsInTra");
        System.out.println("1.CSE");
        System.out.println("2.ECE");
        System.out.println("3.MECH");
        System.out.println("4.CIVIL");
        System.out.println("Enter Department");
        int dept=b.nextInt();
        char A;
        switch(dept)
        {
            case 1:
                System.out.println("Go Straight");
                System.out.println("Welcome to CSE Department");
                System.out.println("a.Coding");
                System.out.println("b.Web Designing");
                System.out.println("c.Database");
                System.out.println("Enter Event");
                A=b.next().charAt(0);
                switch(A)
                {
                    case 'a':
                            System.out.println("Go to hall S108");
                            break;
                    case 'b':
                        System.out.println("Go to hall S208");
                        break;
                    case 'c':
                        System.out.println("Go to hall S206");
                        break;
                    default:
                        System.out.println("No Event exist");
                }
                break;
            case 2:
                System.out.println("Go Right");
                System.out.println("Welcome to ECE Department");
                System.out.println("a.Project Expo");
                System.out.println("b.PPt");
                System.out.println("c.Circuit Debug");
                System.out.println("Enter Event");
                A=b.next().charAt(0);
                switch(A)
                {
                    case 'a':
                            System.out.println("Go to hall M108");
                            break;
                    case 'b':
                        System.out.println("Go to hall M208");
                        break;
                    case 'c':
                        System.out.println("Go to hall M206");
                        break;
                    default:
                        System.out.println("No Event exist");
                }
                break;
            case 3:
                System.out.println("Go Left");
                System.out.println("Welcome to MECH Department");
                System.out.println("a.BottleRocketery");
                System.out.println("b.PPT");
                System.out.println("c.Mad 4 CAD");
                System.out.println("Enter Event");
                A=b.next().charAt(0);
                switch(A)
                {
                    case 'a':
                            System.out.println("Go to hall N108");
                            break;
                    case 'b':
                        System.out.println("Go to hall N208");
                        break;
                    case 'c':
                        System.out.println("Go to hall N206");
                        break;
                    default:
                        System.out.println("No Event exist");
                }
                break;
            case 4:
                System.out.println("Go Straight and turn Left");
                System.out.println("Welcome to CIVIL Department");
                System.out.println("a.CADD Quest");
                System.out.println("b.Brick Bonding");
                System.out.println("c.Model Making");
                System.out.println("Enter Event");
                A=b.next().charAt(0);
                switch(A)
                {
                    case 'a':
                            System.out.println("Go to hall C108");
                            break;
                    case 'b':
                        System.out.println("Go to hall C208");
                        break;
                    case 'c':
                        System.out.println("Go to hall C206");
                        break;
                    default:
                        System.out.println("No Event exist");
                }
                break;
            default:
                System.out.println("Wrong Input");
        }
    }
}
