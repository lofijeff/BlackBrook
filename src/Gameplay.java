import art.SplashScreens;
import enteties.Player;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Gameplay {
  private SplashScreens splash = new SplashScreens();
  private Scanner scan = new Scanner(System.in);
  private int choice = 0;
  private CharacterCreation characterCreation = new CharacterCreation();

  public static void wait(int milliseconds) {
    try {
      Thread.sleep(milliseconds);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

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
    Player player = new Player();
    System.out.println("Hey. What is your name?");
    scan.nextLine();
    String name = scan.nextLine();
    System.out.println("Welcome, " + name + ". What... Are you?");
    System.out.println("[1]SOLDIER\n[2]THIEF\n[3]WITCH");
    choice = scan.nextInt();
    switch (choice) {
      case 1:
        player = characterCreation.createSoldier(name);
        adventurePartOne(player);
        break;
      case 2:
        player = characterCreation.createThief(name);
        adventurePartOne(player);
        break;
      case 3:
        player = characterCreation.createWitch(name);
        adventurePartOne(player);
        break;
    }
  }

  public void adventurePartOne(Player player) {
    System.out.println(".");
    wait(500);
    System.out.println(".");
    wait(500);
    System.out.println(".");
    wait(500);
    System.out.println(
        "You walk outside of the decreped hut.\nThere is a clear path to your right, that looks like it leads\ninto the woods.");
    scan.nextLine();
    choice = scan.nextInt();
    switch (choice) {
      case 1:
        break;
    }
  }
}
