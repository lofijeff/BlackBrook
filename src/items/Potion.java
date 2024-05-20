package items;

public class Potion {

  String useText;
  String throwText;
  String description;
  String type;
  int healthRestored;
  int damage;

  public Potion() {
  }

  public Potion(String throwText, String type, String useText, String description, int healthRestored, int damage) {
    this.useText = useText;
    this.description = description;
    this.healthRestored = healthRestored;
    this.damage = damage;
    this.type = type;
    this.throwText = throwText;
  }

  public String getThrowText() {
    if (throwText.isBlank()) {
      return "You throw the potion.";
    } else {
      return throwText;
    }
  }

  public void setThrowText(String throwText) {
    this.throwText = throwText;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getUseText() {
    return useText;
  }

  public void setUseText(String damageText) {
    this.useText = damageText;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getHealthRestored() {
    return healthRestored;
  }

  public void setHealthRestored(int healthRestored) {
    this.healthRestored = healthRestored;
  }

  public int getDamage() {
    return damage;
  }

  public void setDamage(int damage) {
    this.damage = damage;
  }

  public Potion getHealthPotion(int healthRestored) {
    Potion potion = new Potion();
    potion.setType("health potion");
    potion.setHealthRestored(healthRestored);
    potion.setDescription("Just your normal, green potion.");
    potion.setThrowText("For some reason you throw the health potion.");
    return potion;
  }

  public Potion getPoisonPotion(int healthRestored, int damage) {
    Potion potion = new Potion();
    potion.setType("bottle of poison");
    potion.setHealthRestored(healthRestored);
    potion.setDamage(damage);
    potion.setDescription("This looks fishy. Really fishy.");
    potion.setThrowText("You throw the bottle. The green liquid gets all over HMMMM hur ska jag få in fienden här?");
    return potion;
  }

  public Potion getFirePotion(int damage) {
    Potion potion = new Potion();
    potion.setDamage(damage);
    potion.setType("bottle of liquid fire");
    potion.setDescription("This looks... Spicy?");
    potion.setUseText("You take a zip and catch on fire. You take " + damage + " damage. Dingus.");
    potion.setThrowText("You throw the potion, and BLABLABLA catches fire!!");
    return potion;
  }

  public Potion getManaPotion(int mana) {
    Potion potion = new Potion();
    potion.setHealthRestored(mana);
    potion.setType("mana potion");
    potion.setDescription("A beautiful blue potion. How about you try it?");
    potion.setUseText("You drink it. It feels like a cold stream down your throat.");
    potion.setThrowText("You throw it. Nothing happends.");
    return potion;
  }
}
