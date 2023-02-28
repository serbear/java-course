public class Carpet {
    private double cost;

    public Carpet(double cost) {
        /*
        In case the cost parameter is less than 0 it needs to set the cost
        field value to 0.
         */
        this.cost = cost < 0 ? 0 : cost;
    }
    public double getCost() {
        return this.cost;
    }

}
