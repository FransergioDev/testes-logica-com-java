import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class PrimeiroDesafio {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int lines = Integer.parseInt(st.nextToken());

        ArrayList<Integer> inputValues = new ArrayList<Integer>();

        for (int i = 0; i < lines; i++) {
            st = new StringTokenizer(br.readLine());
            inputValues.add(Integer.parseInt(st.nextToken()));
        }

        var evens = inputValues.stream().filter(l -> l % 2 == 0).sorted().collect(Collectors.toList());
        var odds = inputValues.stream().filter(l -> l % 2 != 0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println("\n");
        List<Integer> result = new ArrayList<>();
        result.addAll(evens);
        result.addAll(odds);
        result.forEach(System.out::println);
    }
}