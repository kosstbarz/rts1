package core;

import java.lang.String;
import java.util.Scanner;

public class GameClass {

    static String commandString;
    static int commandNum;
    static int programCicle = 1;
    static int  gameCicle = 0;
    static int playerCount = 0;
    static int globalCicle = 1;

    static String checkString(String commandString) {

        String stringAnswer;
        stringAnswer = null;
        Scanner input = new Scanner(System.in);

        switch (commandString) {

            case "":
                stringAnswer = "Empty text.Try again.";
                break;
            case "/rules": {
                stringAnswer = "Write (/create game) to create game field " + "\n" +
                        "If you want to end game write(/end game)" + "\n" +
                        "if you want to exit game press cross in the upper right conner or write(/exit game)";
                break;
            }

            case "/create game": {
                stringAnswer="Game has been created.";
                System.out.println("Write number bigger then 1 and less then 4.")   ;
                commandNum=input.nextInt();
                checkNum(commandNum);
                gameCicle=1;
                break;
            }

            case "/exit game": {
                stringAnswer = "Do really want to exit the game?(write (/yes)or(/no))";
                commandString = input.nextLine();
                if (commandString.equals("/yes")) {
                    programCicle = 0;
                }
                break;
            }

            default: {
                stringAnswer = "Unknown command.Try again.";
            }
        }
        return stringAnswer;
    }

    static int checkNum(int commandNum){
        int numAnswer;

        Scanner input = new Scanner(System.in);
        numAnswer=commandNum;
        System.out.println("There "+commandNum+" players.");
        return numAnswer;
    }

    public static void main(String[] args) {

        System.out.println("Hello!");
        System.out.println("Welcome to my first game.");
        System.out.println("This is my first experience in game developing.");
        System.out.println("There are some commands, which help you to play.");
        System.out.println("Write (/rules) to see all the commands.");

        Scanner input = new Scanner(System.in);

        while (programCicle == 1) {
            commandString = input.nextLine();
            System.out.println(checkString(commandString));
            while (gameCicle == 1){
                System.exit(0);
            }
        }
        System.out.println("See you later.");
    }
}
