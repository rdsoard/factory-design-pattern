/**
 * 
 * @author Rebekah Soard
 * This class contains the information for the frosted flakes cereal
 */
public class FrostedFlakes extends Cereal {
    private static final double COST = 2.99;
/**
 * This method sets the name and cost of the cereal to match the class
 */
    FrostedFlakes() {
        this.name = "Frosted Flakes";
        this.price = COST;
    }
/**
 * This method calls the parent method and prints out a special method for this type of cereal
 */
    public void prepare() {
        super.prepare();
        System.out.println("  - Gather the grain\n  - Shape into flakes\n  - Sprinkle with frosting");
    }
}
