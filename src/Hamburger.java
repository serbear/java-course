
public class Hamburger {
    String name;
    String meat;
    double price;
    String breadRollType;

    String addition1Name;
    double addition1Price;
    String addition2Name;
    double addition2Price;
    String addition3Name;
    double addition3Price;
    String addition4Name;
    double addition4Price;

    public Hamburger(
            String name, String meat, double price, String breadRollType
    ) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;

        System.out.println(
                this.name + " hamburger on a " + this.breadRollType
                        + " roll with " + this.meat
                        + ", price is " + this.price
        );
    }

    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger() {
        // Tomato for an extra 0.27

        if (this.addition1Price > 0)
            System.out.println(
                    "Added " + this.addition1Name + " for an extra "
                            + this.addition1Price
            );

        if (this.addition2Price > 0)
            System.out.println(
                    "Added " + this.addition2Name + " for an extra "
                            + this.addition2Price
            );

        if (this.addition3Price > 0)
            System.out.println(
                    "Added " + this.addition3Name + " for an extra "
                            + this.addition3Price
            );

        if (this.addition4Price > 0)
            System.out.println(
                    "Added " + this.addition1Name + " for an extra "
                            + this.addition4Price
            );

        return (
                this.price + this.addition1Price + this.addition2Price
                + this.addition3Price + this.addition4Price
                );
    }
}
