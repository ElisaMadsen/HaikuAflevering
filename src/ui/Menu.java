package ui;
import java.util.Scanner;


public class Menu {
    static Scanner scanner = new Scanner(System.in);

    public void welcome() {
        System.out.println("---------------------------------------------------------");
        System.out.println("              WELCOME TO HAIKU APPLICATION");
        System.out.println("---------------------------------------------------------");

    }

    public void haikuRules(){
        System.out.println("Let's write a haikupoem!\nFirst, let's sum up the rules:");
        System.out.println("The first line must be 5 syllables.");
        System.out.println("The second line must be 7 syllables.");
        System.out.println("The third and last line must contain 5 syllables again.\n");
    }

    public String getAuthor() {
        System.out.println("Type in your name:");
        return scanner.nextLine();

    }

    public String getFirstLine() {
        System.out.println("\nPlease enter your first line:");
        return scanner.nextLine();

    }
    public String getSecondLine() {
        System.out.println("\nNow enter your second line:");
        return scanner.nextLine();
    }
    public String getThirdLine() {
        System.out.println("\nLastly enter the last line:");
        return scanner.nextLine();
    }
}

