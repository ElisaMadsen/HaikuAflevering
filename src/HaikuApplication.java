import data.HaikuWriter;
import haikuanalysis.HaikuAnalysis;
import haikuanalysis.HaikuPoem;
import ui.Menu;

import java.util.Scanner;

public class HaikuApplication {

    private final Menu menu = new Menu();
    private final HaikuAnalysis haikuAnalysis = new HaikuAnalysis();
    private final HaikuWriter haikuWriter = new HaikuWriter();

    public static void main(String[] args) {
        HaikuApplication app = new HaikuApplication();
        app.menu.welcome();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("* Enter 1 to create a haiku poem\n* Enter 2 to quit");
            int quitOrContinue = sc.nextInt();
            if (quitOrContinue == 1) {
                app.menu.haikuRules();
                String author = app.menu.getAuthor();
                String firstLine = app.menu.getFirstLine();
                String secondLine = app.menu.getSecondLine();
                String thirdLine = app.menu.getThirdLine();

                HaikuPoem poem = new HaikuPoem(author, firstLine, secondLine, thirdLine);

                boolean saveHaiku = app.haikuAnalysis.isPoemCorrect(poem);
                if (saveHaiku) {
                    app.haikuWriter.haikuStorage(poem);

                }
            } else if (quitOrContinue == 2) {
                System.out.println("See you next time! 👋");
                break;
            }
            else {
                System.out.println("Please enter 1 or 2!!\n");
            }
        }
    }
}
