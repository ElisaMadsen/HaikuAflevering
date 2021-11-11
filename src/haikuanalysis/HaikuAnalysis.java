package haikuanalysis;

public class HaikuAnalysis {

    public char[] vowels = {'a', 'A', 'e', 'E', 'I', 'i', 'O', 'o', 'U', 'u', 'Y', 'y', 'Æ', 'æ', 'Ø', 'ø', 'Å', 'å'};

    public boolean hasFiveVowels(String line){
        char [] lineInputFromUser = line.toCharArray();
        int vowelCounter = 0;
        for (char character : lineInputFromUser) {
            for (char vowel : vowels) {
                if (character == vowel) {
                    vowelCounter++;
                }
            }
        }
        return vowelCounter == 5;
    }

    public boolean hasSevenVowels(String line){
        char[] lineInputFromUser = line.toCharArray();
        int vowelCounter = 0;
        for (char character : lineInputFromUser) {
            for (char vowel : vowels) {
                if (character == vowel) {
                    vowelCounter++;
                }
            }
        }
        return vowelCounter == 7;
    }

    public boolean isPoemCorrect(HaikuPoem userPoem){
        String firstLine = userPoem.getFirstLine();
        String secondLine = userPoem.getSecondLine();
        String thirdLine = userPoem.getThirdLine();

        if (hasFiveVowels(firstLine) && hasSevenVowels(secondLine) && hasFiveVowels(thirdLine)){
            System.out.println("\nheres your poem:");
            System.out.println(userPoem);
            System.out.println("\nThat's correct! Beautiful haiku!\nYou poem will be stored in our Haiku storage 🎆\n");
            return true;
        } else {
            System.out.println("\nYour poem isn't a haiku! Your poem will not be stored!😢\n");
            return false;
        }
    }


}
