package Laboratory1;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public void print_ApplicationMenu(){
        System.out.println("Atelierul digital Google");
        System.out.println("-------------------------");
        System.out.println("    Application Menu     ");
        System.out.println("1.Code Challenge One;");
        System.out.println("2.Code Challenge Two;");
        System.out.println("3.Code Challenge Three;");
        System.out.println("4.Code Challenge Four;");
        System.out.println("5.Class exercises;");
        System.out.println("0.Exit;");
        System.out.println("-------------------------");
    }

    public void print_CodeChallengeOneMenu(){
        System.out.println("-------------------------");
        System.out.println("  Code Challenge One  ");
        System.out.println("-------------------------");
        System.out.println("1. Stage One;");
        System.out.println("Write a program that prints the numbers from 1 to 100.");
        System.out.println("But for multiples of 3 print 'Fizz' instead of the number.");
        System.out.println("And for the multiples of 5 print 'Buzz'.");
        System.out.println("For numbers which are multiples of both 3 and 5 print 'FizzBuzz'.");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("2. Stage Two;");
        System.out.println("But for multiples of 7 print 'Rizz' instead of the number.");
        System.out.println("And for the multiples of 11 print 'Jazz'.");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("0.Exit;");
        System.out.println("-------------------------");
    }

    public void print_CodeChallengeTwoMenu(){
        System.out.println("-------------------------");
        System.out.println("  Code Challenge Two  ");
        System.out.println("-------------------------");
        System.out.println("1. Stage One;");
        System.out.println("You should implement a function String compute(int) which implements the following rules:");
        System.out.println("If the number is divisible by 3, write 'Foo' instead of the number.");
        System.out.println("If the number is divisible by 5, add 'Bar'.");
        System.out.println("If the number is divisible by 7, add 'Qix'.");
        System.out.println("For each digits 3, 5, 7, add 'Foo', 'Bar', 'Qix' in the digits order.");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("2. Stage Two;");
        System.out.println("We have a business request: we must keep a trace of 0 in numbers, each 0 must be replace par char '*'");
        System.out.println("For this we will create a new function String compute2(int) where we will add this logic on top of the results from compute.");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("0.Exit;");
        System.out.println("-------------------------");
    }

    public void print_CodeChallengeThreeMenu() {
        System.out.println("-------------------------");
        System.out.println("  Code Challenge Three  ");
        System.out.println("-------------------------");
        System.out.println("Problem Statement");
        System.out.println("Given an array of integers, find the numbers of pairs from the array.");
        System.out.println("A pair is defined as any 2 numbers added result 0.");
        System.out.println("A number involved in a pair cannot be part of another pair.");
        System.out.println("---------------------------------------------------------------------");
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        boolean runProgram = true;
        while (runProgram){
            main.print_ApplicationMenu();
            System.out.print("Choose one option: ");
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            switch (option){
                case 1 -> {
                    FizzBuzz fizzBuzz = new FizzBuzz();
                    boolean runTask = true;
                    while (runTask){
                        main.print_CodeChallengeOneMenu();
                        System.out.print("Choose one option: ");
                        Scanner scannerInput = new Scanner(System.in);
                        int optionSelected = scannerInput.nextInt();
                        switch (optionSelected){
                            case 1 ->{
                                System.out.println(fizzBuzz.result_StageOne());
                            }
                            case 2 ->{
                                System.out.println(fizzBuzz.result_StageTwo());
                            }
                            case 0 ->{
                                System.out.println("Menu closed!");
                                runTask = false;
                            }
                            default -> System.out.println("Invalid selected option!");
                        }
                    }
                }
                case 2 -> {
                    FooBarQix fooBarQix = new FooBarQix();
                    boolean runTask = true;
                    while (runTask){
                        main.print_CodeChallengeTwoMenu();
                        System.out.print("Choose one option: ");
                        Scanner scannerInput = new Scanner(System.in);
                        int optionSelected = scannerInput.nextInt();
                        switch (optionSelected){
                            case 1 ->{
                                System.out.println(fooBarQix.result_StageOne());
                            }
                            case 2 ->{
                                System.out.println(fooBarQix.result_StageTwo());
                            }
                            case 0 ->{
                                System.out.println("Menu closed!");
                                runTask = false;
                            }
                            default -> System.out.println("Invalid selected option!");
                        }
                    }
                }
                case 3 -> {
                    main.print_CodeChallengeThreeMenu();
                    String result = "First example: \n";
                    List<Integer> array1 = Arrays.asList(3,2,-3,-2,3,0);
                    PairOfTwo testArray1 = new PairOfTwo(array1);
                    result = result.concat(testArray1 + "\n");
                    result = result.concat("Number of Pairs: " + testArray1.findNumberOfPairs() +"\n");
                    result = result.concat("Second example: \n");
                    List<Integer> array2 = Arrays.asList(1,1,0,-1,-1);
                    PairOfTwo testArray2 = new PairOfTwo(array2);
                    result = result.concat(testArray2 + "\n");
                    result = result.concat("Number of Pairs: " + testArray2.findNumberOfPairs() +"\n");
                    result = result.concat("Third example: \n");
                    List<Integer> array3 = Arrays.asList(5,9,-5,7,-5);
                    PairOfTwo testArray3 = new PairOfTwo(array3);
                    result = result.concat(testArray3 + "\n");
                    result = result.concat("Number of Pairs: " + testArray3.findNumberOfPairs() +"\n");
                    System.out.println(result);
                }
                case 4 -> {
                    System.out.println("Working on it...");
                }
                case 5 -> {
                    Exercises exercises = new Exercises();
                    exercises.arrays();
                }
                case 0 -> {
                    System.out.println("Program closed!");
                    runProgram = false;
                }
                default -> System.out.println("Invalid selected option!");
            }
        }
    }
}