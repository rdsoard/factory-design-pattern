/**
 * 
 * @author Rebekah Soard 
 * This class serves as a place to take in user input for creating/ordering a cereal
 */
public class GroceryStore {
 /**
  * This method runs the createCereal method
  * @param type the type of cereal being ordered
  * @return the cereal that was ordered
  */
    public Cereal orderCereal(String type) {
        return this.createCereal(type);
    }
/**
 * This method matches the type given to a Cereal child class, and runs all the Cereal methods
 * @param type the type of cereal that was ordered
 * @return the cereal that was ordered
 */
    private Cereal createCereal(String type) {
        Cereal cereal;
        if (type.equalsIgnoreCase("frosted flakes")) {
            cereal = new FrostedFlakes();
        } else if (type.equalsIgnoreCase("fruit loops")) {
            cereal = new FruitLoops();
        } else if (type.equalsIgnoreCase("lucky charms")) {
            cereal = new LuckyCharms();
        } else {
            cereal = new LuckyCharms();
        }

        cereal.prepare();
        cereal.boxCereal();
        cereal.priceCereal();

        return cereal;
    }
}
