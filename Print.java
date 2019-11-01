import java.util.concurrent.TimeUnit;

public class Print {

    public PrintD(){

    }

    public void CleanPrint() {
        System.out.print("\033[H\033[2J");
    }

    public String[] divideToWords(String string) {
        return string.split(" ");
    }

    public char[] divideToChars(String string){
        return string.toCharArray();
    }

    public void printWordsInDelay(long delayInMs, String stringToPrint[], boolean clean) {
        try {
            for (int i = 0; i < stringToPrint.length; i++) {
                System.out.print(stringToPrint[i] + " ");
                TimeUnit.MILLISECONDS.sleep(delayInMs);
            }
            if (clean) {
                CleanPrint();
            }
        } catch (InterruptedException e) {
        }
    }

    public void printCharsInDelay(long delayInMs, char stringToPrint[], boolean clean) {
        try {
            for (int i = 0; i < stringToPrint.length; i++) {
                System.out.print(stringToPrint[i]);
                TimeUnit.MILLISECONDS.sleep(delayInMs);
            }
            if (clean) {
                CleanPrint();
            }
        } catch (InterruptedException e) {
        }
    }
}