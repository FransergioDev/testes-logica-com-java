import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class SegundoDesafio {
    public static void main(String[] args) {
        Float[] notes = {100f, 50f, 20f, 10f, 5f, 2f};
        Float[] coins = {1f, 0.50f, 0.25f, 0.10f, 0.05f, 0.01f};

        String[][] notesChange = new String[notes.length][2];
        String[][] coinsChange = new String[coins.length][2];

        /**
        * Ensure descending sort order if values came from an external source
        */
        Arrays.sort(notes, Collections.reverseOrder());
        Arrays.sort(coins, Collections.reverseOrder());

        System.out.println("Por favor digite um valor em reais: No formato(0.00)");
        Scanner scan = new Scanner(System.in);
        Float input = Float.parseFloat(scan.nextLine()); //576.73F;
        scan.close();

        if (input <= 0) {
            System.out.println("Valor inválido");
            return;
        } else {
            for (int noteIndex = 0; noteIndex < notes.length; noteIndex ++) {
                Integer notesCount = (int) Math.floor(input/notes[noteIndex]);
                notesChange[noteIndex][0] = String.format(Locale.ROOT,"%.02f", notes[noteIndex]);
                notesChange[noteIndex][1] = String.format("%d", notesCount);
                input = Float.parseFloat(String.format(Locale.ROOT,"%.02f", input - (notes[noteIndex] * notesCount)));
            }

            for (int coinIndex = 0; coinIndex < notes.length; coinIndex ++) {
                Integer coinCount = (int) Math.floor(input/coins[coinIndex]);
                coinsChange[coinIndex][0] = String.format(Locale.ROOT,"%.02f", coins[coinIndex]);
                coinsChange[coinIndex][1] = String.format("%d", coinCount);
                input = Float.parseFloat(String.format(Locale.ROOT,"%.02f", input - (coins[coinIndex] * coinCount)));
            }

            System.out.println("NOTAS:");
            for (int i = 0; i < notesChange.length; i ++) System.out.println(notesChange[i][1] + " nota(s) de  R$ " + notesChange[i][0]);

            System.out.println("MOEDAS:");
            for (int c = 0; c < coinsChange.length; c ++) System.out.println(coinsChange[c][1] + " moeda(s) de  R$ " + coinsChange[c][0]);
        }
    }
}