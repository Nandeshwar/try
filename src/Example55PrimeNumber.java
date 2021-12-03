import java.util.*;
public class Example55PrimeNumber {
    public static void main(String[] args) {
        Example55PrimeNumber e = new Example55PrimeNumber();
        for (int num :e.primeNumbersBetween(1, 1000000)) {
            System.out.println(num);
        }
    }

    List<Integer> primeNumbersBetween(int start, int end) {
        List<Integer> primeNumbers = new ArrayList<>();
        boolean[] primeNumbersBool = new boolean[end+1];
        Arrays.fill(primeNumbersBool, true);

        primeNumbersBool[0] = false;
        primeNumbersBool[1] = false;

        for(int i = 2; i*i <= end; i++) {
            for(int j= i * 2; j <= end; j = j + i) {
                primeNumbersBool[j] = false;
            }
        }

        for(int i = 0; i <= end; i++) {
            if(primeNumbersBool[i]) {
                primeNumbers.add(i);
            }
        }

        return primeNumbers;
    }
}
