/**
 * 
 * @author Rebekah Soard
 * This class contains the information for the fruit loops cereal
 */
public class FruitLoops extends Cereal {
    private static final double COST = 1.89;
/**
 * This method sets the name and cost of the cereal to match the class
 */
    FruitLoops() {
        this.name = "Fruit Loops";
        this.price = COST;
    }
/**
 * This method calls the parent method and prints out a special method for this type of cereal
 */
    public void prepare() {
        super.prepare();
        System.out.println(
            "  - Gather the grain\n  - Shape into circles\n  - Randomly color circles\n  - Let circles dry");
    }
}
