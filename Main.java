package homeWoork;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> inputStrings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите строку (или 'quit' для завершения): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("quit")) {
                break;
            }

            inputStrings.add(input);
        }

        for (String str : inputStrings) {
            System.out.println(str);
        }

        String longestString = findLongestString(inputStrings);
        String shortestString = findShortestString(inputStrings);

        System.out.println("Самая длинная строка: " + longestString);
        System.out.println("Самая короткая строка: " + shortestString);
    }

    public static String findLongestString(ArrayList<String> strings) {
        String longest = "";
        for (String str : strings) {
            if (str.length() > longest.length()) {
                longest = str;
            }
        }
        return longest;
    }

    public static String findShortestString(ArrayList<String> strings) {
        if (strings.isEmpty()) {
            return "";
        }
        String shortest = strings.get(0);
        for (String str : strings) {
            if (str.length() < shortest.length()) {
                shortest = str;
            }
        }
        return shortest;
    }
}