package chocolateBoiler;

public class ChocolateBoilerSimulator {

    public static void main(String[] args) {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill(); // empty FALSE, boiled FALSE
        boiler.boil(); // empty FALSE, boiled TRUE
        boiler.drain(); // empty TRUE

        EnumChocolateBoiler enumBoiler= EnumChocolateBoiler.INSTANCE; // enum
        enumBoiler.fill();
        enumBoiler.boil();
        enumBoiler.drain();
    }
}
