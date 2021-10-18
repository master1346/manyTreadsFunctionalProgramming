package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        String inputWord;
        Function<String[], List<String>> splitInString = x -> Arrays.stream(x).sorted().collect(Collectors.toList());

        System.out.println("Введите предложение:");
        inputWord = scanner.nextLine();
        String[] inputWordArr = inputWord.trim().split(" ");


        System.out.println("До: " + inputWord);
        System.out.print("После: ");
        List<String> listWord = splitInString.apply(inputWordArr);
        for (String str:listWord) System.out.print(str + " ");
        System.out.println(" ");
    }
}
