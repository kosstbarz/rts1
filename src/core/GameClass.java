package core;

import java.lang.String;
import java.util.Scanner;

public class GameClass {

    static String command;
    private static int a=1;

    public static void main(String[]args) {

        System.out.println("Hello!");
        System.out.println("Welcome to my first game.");
        System.out.println("This is my first experience in game developing.");
        System.out.println("There are some commands, which help you to play.");
        System.out.println("Write (/rules) to see all the commands.");

        Scanner input = new Scanner(System.in);

        while (a == 1) {
            command = input.nextLine();

            switch(command) {

                case "":
                    System.out.println("Empty text.Try again.");
                    break;
                case "/rules": {
                    System.out.println("Write (/create game) to create game field ");
                    System.out.println("If you want to end game write(/end game)");
                    System.out.println("if you want to begin tutorial write (/start tutorial)");
                    System.out.println("if you want to exit game press cross in the upper right conner or write(/exit game)");
                    break;
                }

                case "/create game": {
                    Object Game = new Object();
                    System.out.println("Game has been created.");
                    break;
                }

                case "/start tutorial": {
                    Object GameTutorial = new Object();
                    System.out.println("Tutorial has been created.");
                    break;
                }

                case "/exit game": {
                    System.out.println("Do really want to exit the game?(write (/yes)or(/no))");
                    command = input.nextLine();
                    if (command.equals("/yes")) {
                        a = 0;
                    }
                    break;
                }

                default: {
                    System.out.println("Unknown command.Try again.");
                }
            }
        }
        System.out.println("See you later.");
    }
}
