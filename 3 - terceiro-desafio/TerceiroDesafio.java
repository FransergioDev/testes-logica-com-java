import java.util.ArrayList;
import java.util.Scanner;

public class TerceiroDesafio {
    public static void main(String[] args) {
        int result = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();

        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor informe o número de linhas:");
        int n = Integer.parseInt(scan.nextLine());
        System.out.println("Por favor informe o valor alvo:");

        int k = Integer.parseInt(scan.nextLine());
        System.out.println("Por favor informe os numeros da lista a ser analisada:");

        for (int i = 0; i < n; i++) arr.add(Integer.parseInt(scan.nextLine()));

        scan.close();


        for (int indexArr = 0; indexArr <= arr.size(); indexArr++) {
            if ((indexArr + 1) < arr.size()) {
                Integer resultTarget = arr.get(indexArr+1) - arr.get(indexArr);
                if (resultTarget == k || (resultTarget * -1) == k) result++; 
            }
        }

        System.out.println("Resultado:\n" + result);
    }
}