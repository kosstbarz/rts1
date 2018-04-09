package core;


import java.lang.String;
import java.util.Scanner;



public class GameClass {
    static String command;
    private static int a=1;
    static public void main(String[]args) {

        Scanner input = new Scanner(System.in);
        System.out.println("hello!");
        System.out.println("Welcome to my first game.");
        System.out.println("This is my first experience in game developing.");
        System.out.println("There are some commands, which help you to play.");
        System.out.println("Write (/rules) to see all the commands.");

        while (a == 1) {
        command = input.nextLine();
        System.out.println(command);
            switch(command) {
                case "":
                    System.out.println("Empty text.Try again.");
                default:
                    if (command.equals("/rules")) {
                        System.out.println("Write (/create game) to create game field ");
                        System.out.println("If you want to end game write(/end game");
                        System.out.println("if you want to begin tutorial write (/start tutorial");
                        System.out.println("if you want to exit game press cross in the upper right conner or write(/exit game)");
                    }
                    if (command.equals("/create game")) {
                        Object Game = new Object();
                        System.out.println("Game has been created.");
                        command = input.nextLine();
                    }
                    if (command.equals("/start tutorial")) {
                        Object GameTutorial = new Object();
                        System.out.println("Tutorial has been created.");
                        command = input.nextLine();
                    }
                    if (command.equals("/exit game")) {
                        System.exit(0);
                    }
            }
        }




    }
}
