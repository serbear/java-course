public class HealthyBurger extends Hamburger {
    String healthyExtra1Name;
    double healthyExtra1Price;
    String healthyExtra2Name;
    double healthyExtra2Price;


    public HealthyBurger(String meat, double price) {
        super("HealthyBurger", meat, price, "Brown rye");
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {

        if (this.healthyExtra1Price > 0)
            System.out.println(
                    "Added " + this.healthyExtra1Name + " for an extra "
                            + this.healthyExtra1Price
            );

        if (this.healthyExtra2Price > 0)
            System.out.println(
                    "Added " + this.healthyExtra2Name + " for an extra "
                            + this.healthyExtra2Price
            );

        return super.itemizeHamburger() + (
                this.healthyExtra1Price + this.healthyExtra2Price
        );
    }
}
