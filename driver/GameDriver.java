package driver;

import java.util.Scanner;

import model.*;

public class GameDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Finn finn = new Finn();
        Jake jake = new Jake();
        Alliens alliens = new Alliens();

        System.out.println("Choose the character (0: Finn, 1: Jake, 2: Alien): ");
        int choice = scanner.nextInt();
        CharacterType characterType = null;

        switch (choice) {
            case 0:
                characterType = CharacterType.FINN;
                break;
            case 1:
                characterType = CharacterType.JAKE;
                break;
            case 2:
                characterType = CharacterType.ALLIENS;
                break;
            default:
                System.out.println("Invalid Chosen!");
        }

        if (characterType == CharacterType.FINN) {
            System.out.println("Power Finn: " + finn.usePower());
        } else if (characterType == CharacterType.JAKE) {
            System.out.println("Power Jake: " + jake.usePower());
        } else if (characterType == CharacterType.ALLIENS) {
            System.out.println("Power Alien: " + alliens.usePower());
        } else {
            System.out.println("Invalid Chosen!");
        }

        scanner.close();
    }
}
