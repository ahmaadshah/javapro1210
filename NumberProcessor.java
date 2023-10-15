package homeWoork;

import java.util.ArrayList;
import java.util.Random;

public class NumberProcessor {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = generateRandomNumbers(10);
        System.out.println(" " + numbers);
        removeNegativeNumbers(numbers);
        System.out.println(" " + numbers);
    }
    public static ArrayList<Integer>generateRandomNumbers(int count){
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            int num = random.nextInt(201) - 100; // slochaini ot -100 do 100
            numbers.add(num);
        }
        return numbers ;
    }
    public static void removeNegativeNumbers(ArrayList<Integer>numbers) {
        numbers.removeIf(num -> num < 0);
    }
}
