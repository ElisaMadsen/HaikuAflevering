package haikuanalysis;

public class HaikuPoem {
    private final String author;
    private final int id;
    private final String firstLine;
    private final String secondLine;
    private final String thirdLine;
    private static int counter = 0;


    public HaikuPoem(String author, String firstLine, String secondLine, String thirdLine) {
        this.author = author;
        this.firstLine = firstLine;
        this.secondLine = secondLine;
        this.thirdLine = thirdLine;
        counter++;
        this.id = counter;
    }

    public String getFirstLine() {
        return firstLine;
    }

    public String getSecondLine() {
        return secondLine;
    }

    public String getThirdLine() {
        return thirdLine;
    }

    @Override
    public String toString() {
        return "Author: " + author  +
                ", \nid: " + id +
                " \n" + firstLine + '\'' +
                " " + secondLine + '\'' +
                " " + thirdLine + '\'';
    }
}
