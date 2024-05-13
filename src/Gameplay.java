import art.SplashScreens;
import enteties.Player;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Gameplay {
  private SplashScreens splash = new SplashScreens();
  private Scanner scan = new Scanner(System.in);
  private int choice = 0;
  private CharacterCreation characterCreation = new CharacterCreation();
  Player player = new Player();

  public void start() {
    splash.blackBrookLogo();
    boolean validChoice = false;
    try {
      while (!validChoice) {
        System.out.println("[1]NEW GAME\n[2]LOAD");
        int choice = scan.nextInt();
        if (choice == 1) {
          newGameFirstPart();
          validChoice = true;
        } else if (choice == 2) {
          // loadGame();
          validChoice = true;
        } else {
          System.out.println("Invalid choice. Please enter 1 or 2.");
        }
      }
    } catch (InputMismatchException e) {
      System.out.println("Invalid input. Please enter a number.");
      scan.nextLine();
      start();
    } catch (Exception e) {
      System.out.println("An error occurred: " + e.getMessage());
    }
  }

  public void newGameFirstPart() {
    // TODO lägg till sparningsfunktionen
    System.out.println("Hey. What is your name?");
    scan.nextLine();
    String name = scan.nextLine();
    System.out.println("Welcome, " + name + ". What... Are you?");
    System.out.println("[1]SOLDIER\n[2]THIEF\n[3]WITCH");
    choice = scan.nextInt();
    switch (choice) {
      case 1:
        player = characterCreation.createSoldier(name);
        break;
      case 2:
        player = characterCreation.createThief(name);
        break;
      case 3:
        player = characterCreation.createWitch(name);
        break;
      default:
        adventurePartOne(player);
    }
  }

  public void adventurePartOne(Player player) {
    System.out.println("Bla bla bla, story. Ojdå dags för BATTLE baserat på ett val!!!");
    choice = scan.nextInt();
    switch (choice) {
      case 1:
        break;
    }
  }
}
