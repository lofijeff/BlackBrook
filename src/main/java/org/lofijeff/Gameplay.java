package org.lofijeff;

import org.lofijeff.art.SplashScreens;
import org.lofijeff.enteties.Player;
import org.lofijeff.items.*;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

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
        "You walk outside of the decreped hut.\nThere is a clear path to your right, that looks like it leads\ninto the woods.\n[1]Left\n[2]Right");
    scan.nextLine();
    choice = scan.nextInt();
    switch (choice) {
      case 1:
        encounterRandomizer(player);
        break;
    }
  }

  public void encounterRandomizer(Player player) {
    System.out.println("Lets pretend that there were just a GREAT battle! Lets see if we can get you some loot.");
    wait(250);
    System.out.println(lootType(player));
  }

  public String lootType(Player player) {
    Object loot = lootRandomizer();
    if (loot.getClass().getName().equals("items.Potion")) {
      if (loot instanceof Potion) {
        Potion potion = (Potion) loot;
        player.potions.add((Potion) loot);
      }
      return "potion";
    } else if (loot.getClass().getName().equals("items.Weapon")) {
      return "weapon";
    }
    return "UNDEFINED LOOT";
  }

  public Object lootRandomizer() {
    Random random = new Random();
    int random100 = random.nextInt(100) + 1;
    if (random100 < 100) {
      int random50 = random.nextInt(50) + 1;
      Potion potion = new Potion();
      potion.setType("health potion");
      potion.setHealthRestored(random50);
      return potion;
    } else if (random100 < 90) {
      int random50 = random.nextInt(50) + 1;
      Potion potion = new Potion();
      potion.setType("fire potion");
      potion.setDamage(random50);
      return potion;
    } else if (random100 < 80) {
      int random50 = random.nextInt(50) + 1;
      Potion potion = new Potion();
      potion.setType("poison potion");
      potion.setDamage(random50);
      return potion;
    } else if (random100 < 70) {
      Potion potion = new Potion();
      potion.setType("mana potion");
      potion.setHealthRestored(5);
      return potion;
    } else if (random100 < 60) {
      return weaponRandomizer();
    } else {
      return "you suck";
    }
  }

  public Weapon weaponRandomizer() {
    Random random = new Random();
    Weapon weapon = new Weapon();
    int random3 = random.nextInt(3) + 1;
    int randomSoldier = random.nextInt(26) + 15;
    int randomSoldierCrit = random.nextInt(randomSoldier + 10) + 1;
    int randomThief = random.nextInt(11) + 15;
    int randomThiefCrit = random.nextInt(randomThief + 8) + 1;
    int randomWitch = random.nextInt(11) + 8;
    int randomWitchCrit = random.nextInt(randomWitch + 7) + 1;
    int randomWitchSpell = random.nextInt(15) + 1;
    if (random3 == 1) {
      weapon.setName("sword");
      weapon.setDamage(randomSoldier);
      weapon.setCriticalDamage(randomSoldierCrit);
      return weapon;
    } else if (random3 == 2) {
      weapon.setName("dagger");
      weapon.setDamage(randomThief);
      weapon.setCriticalDamage(randomThiefCrit);
      return weapon;
    } else {
      weapon.setName("staff");
      weapon.setDamage(randomWitch);
      weapon.setCriticalDamage(randomWitchCrit);
      weapon.setSpellDamage(randomWitchSpell);
      return weapon;
    }
  }
}
