/**
 * Anything that moves and has health
 */
public abstract class Creature extends GameObject{

    protected int health;
    protected int maxHealth;
    protected int gold;


    public Creature(int maxHealth){
        super();
        this.maxHealth = maxHealth;
        this.health = maxHealth;
        this.gold = 0;
    }


    /**
     * Deal damage to this creature
     *
     * @param damage the amount of damage to be dealt to this creature
     */
    public void hurt(int damage){
        health -= damage;
    }


    /**
     * Heal this creature
     *
     * @param heal the amount of health to be recovered
     */
    public void heal(int heal){
        health += heal;
        if(health > maxHealth){
            health = maxHealth;
        }
    }


    /**
     * Getter method for this creature's current health
     *
     * @return current health
     */
    public int getHealth(){
        return health;
    }


    /**
     * Getter method for this creature's maximum health
     *
     * @return maximum health
     */
    public int getMaxHealth(){
        return maxHealth;
    }


    /**
     * Getter method for the amount of gold the creature is carrying
     *
     * @return the amount of gold
     */
    public int getGold(){
        return gold;
    }


    /**
     * Adds an amount of gold to the creature
     *
     * @param amount the amount of gold to be added
     */
    public void addGold(int amount){
        gold += amount;
    }


    /**
     * Removes an amount of gold from the creature
     *
     * @param amount the amount of gold to be removed
     */
    public void takeGold(int amount){
        addGold(-amount);
    }


    @Override
    public boolean passable(){
        return false;
    }

    /**
     * Defines what the creature will do during its turn
     *
     * @param gameBoard the current state of the game board
     * @param location  the location of this creature on the game board
     */
    public abstract void takeTurn(GameBoard gameBoard, Location location);
}
