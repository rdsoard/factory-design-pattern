/**
 * 
 * @author Rebekah Soard
 * This class prints out messages relating to what each method is doing for the cereal 
 */
public class Cereal {
    protected String name;
    protected double price;
/** 
 * This method prints out a message about preparing with the name of the cereal
 */
    public void prepare() {
        System.out.println("Preparing the " + this.name);
    }
/**
 * This method prints out a message about boxing the cereal with the name of the cereal
 */
    public void boxCereal() {
        System.out.println(
            "Putting fun pictures of " + this.name + "\nPouring the " + this.name + " into the box");
    }
/**
 * This method prints out a message about pricing the cereal with the price and name
 */
    public void priceCereal() {
        System.out.println("Putting the price tag of $" + this.price + " on the " + this.name + " box");
    }
}
