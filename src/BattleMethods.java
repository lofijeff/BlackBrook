import enteties.*;
import art.*;
import java.util.Random;
import java.util.Scanner;

public class BattleMethods {
  Fiend fiend = new Fiend();
  Player player = new Player();
  SplashScreens splashScreen = new SplashScreens();
  int choice;
  Scanner scan = new Scanner(System.in);

  public void battleLevelOne(Battle battle) {
    Random random = new Random();
    int randomFiend = random.nextInt(5) + 1;

    switch (randomFiend) {
      case 1:
        battle.setFiend(fiend);
        goblinBattle(battle);
        break;
    }
  }

  public void goblinBattle(Battle battle) {
    System.out.println("         ~~~~ " + battle.getPlayer().getName().toUpperCase() + " VS GOBLIN ~~~~");
    splashScreen.fight();
    // if (player.getType().equals("witch")) {
    //
    // }
    // System.out.println("[1]HIT\n[2]DEFEND\n[3]FLEE");
    // Fiend goblin = battle.getFiend();
    // int pDamage = player.getDamage();
    // int fDamage = goblin.getDamage();
    //
    // switch (choice) {
    // case 1:// vad händer när man slåss?
    // System.out.println("You try slapping that bitch with your " +
    // player.getWeapon().getName() + ". ");
    // System.out.println(goblin.getName() + " took" + pDamage + ". Big whoop!");
    // break;
    // case 2:// vad händer när man deffar?
    // break;
    // case 3:// vad händer när man flyr....??:
    // break;
    // }
    int choice;
    int fiendHealth = battle.getFiend().getCurrentHealth();
    int fiendHit = battle.getFiend().getDamage();
    int playerHealth = battle.getPlayer().getCurrentHealth();
    int playerHit = battle.getPlayer().getDamage();
    while (fiendHealth <= 0 || playerHealth <= 0) {

      System.out.println("SLAGGIS! 1 = hit 2 = defend 3 = flee??");
      choice = scan.nextInt();
      switch (choice) {
        case 1:
          fiendHealth -= playerHit;
          break;
        case 2:
          break;
        case 3:
          break;
      }

    }
  }
}
