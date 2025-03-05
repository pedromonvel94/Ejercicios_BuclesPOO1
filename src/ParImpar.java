import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParImpar {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        int evenCount = 0;
        int oddCount = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println("El numero " + number + " es par");
                evenCount++;
            } else {
                System.out.println("El numero " + number + " es impar");
                oddCount++;
            }
        }

        System.out.println("Cantidad de numeros pares: " + evenCount);
        System.out.println("Cantidad de numeros impares: " + oddCount);
    }
}