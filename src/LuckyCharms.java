/**
 * 
 * @author Rebekah Soard
 * This class contains the information for the lucky charms cereal
 */
public class LuckyCharms extends Cereal {
    private static final double COST = 1.55;
/**
 * This method sets the name and cost of the cereal to match the class
 */
    LuckyCharms() {
        this.name = "Lucky Charms";
        this.price = COST;
    }
/**
 * This method calls the parent method and prints out a special method for this type of cereal
 */
    public void prepare() {
        super.prepare();
        System.out.println("  - Gather the grain\n  - Shape into circles\n"
            + "  - Create marshmellow shapes\n  - Mix circles and marshmellows");
    }
}
