package ui;
import java.util.Scanner;


public class Menu {
    static Scanner scanner = new Scanner(System.in);

    //Printing welcome statement
    public void welcome() {
        System.out.println("---------------------------------------------------------");
        System.out.println("              WELCOME TO HAIKU APPLICATION");
        System.out.println("---------------------------------------------------------");
    }

    //Printing rules for haiku poem
    public void haikuRules(){
        System.out.println("Let's write a haikupoem!\nFirst, let's sum up the rules:");
        System.out.println("The first line must be 5 syllables.");
        System.out.println("The second line must be 7 syllables.");
        System.out.println("The third and last line must contain 5 syllables again.\n");
    }

    //Getting name from author with scanner
    public String getAuthor() {
        System.out.println("Type in your name:");
        return scanner.nextLine();
    }

    //Getting first line from author with scanner
    public String getFirstLine() {
        System.out.println("\nPlease enter your first line:");
        return scanner.nextLine();
    }

    //Getting second line from author with scanner
    public String getSecondLine() {
        System.out.println("\nNow enter your second line:");
        return scanner.nextLine();
    }

    //Getting third line from author with scanner
    public String getThirdLine() {
        System.out.println("\nLastly enter the last line:");
        return scanner.nextLine();
    }
}

