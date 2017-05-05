
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Minimal game board used for testing
 */
public class GameBoard{

    public static final int ROWS = 100;
    public static final int COLUMNS = 100;

    private Map<GameObject, Location> objectLocations;


    public GameBoard(){
        init();
    }


    /**
     * Generate tiles and construct the game board
     */
    private void init(){
        this.objectLocations = new LinkedHashMap<>();
    }


    /**
     * Adds a GameObject to the board and the specified Location. Does not add object to impassable tiles.
     *
     * @param object   the object to be added
     * @param location the desired location of the object
     * @return true if the object was successfully added, false otherwise
     */
    public void addObject(GameObject object, Location location){
        this.objectLocations.put(object, location);
    }


    /**
     * Removes an object form the board
     *
     * @param object the object to be removed
     */
    public void removeObject(Creature object){
        if(!this.objectLocations.containsKey(object)){
            System.out.println("Creature not found");
        }else{
            this.objectLocations.remove(object);
        }

    }


    /**
     * Moves a creature on the board and triggers the destination tile to encounter a creature
     *
     * @param creature    the creature to be moved
     * @param newLocation the intended location of the creature
     */
    public void moveCreature(Creature creature, Location newLocation){
        this.objectLocations.put(creature, newLocation);
    }


    /**
     * Gets the location of a particular object
     *
     * @param object the object to find
     * @return the location of the object, or (-1, -1) if the object is not found
     */
    public Location getObjectLocation(GameObject object){
        if(!this.objectLocations.containsKey(object)){
            return new Location(-1, -1);
        }else{
            return this.objectLocations.get(object);
        }
    }


    /**
     * Finds and return the player object. Can be used in conjunction with getObjectLocation to get the player's
     * location
     *
     * @return the player object
     */
    public Player getPlayer(){
        for(GameObject object : this.objectLocations.keySet()){
            if(object instanceof Player){
                return (Player) object;
            }
        }
        return null;
    }

    /**
     * Getter method for the map of objects to locations
     *
     * @return the map of objects to locations
     */
    public Map<GameObject, Location> getObjectsAndLocations(){
        return this.objectLocations;
    }


}
