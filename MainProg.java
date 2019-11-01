import java.util.concurrent.TimeUnit;

public class MainProg {

    public static void main(String[] args) {

        String msg = "Ofek Harel the king of the world.";
        int DELAY_IN_MS = 450;
        Print print = new Print();
        
        print.printWordsInDelay(DELAY_IN_MS, print.divideToWords(msg), true);
        
        DELAY_IN_MS = 250;
        msg = "Helo!";
        print.printCharsInDelay(DELAY_IN_MS, print.divideToChars(msg), false);

    }
}