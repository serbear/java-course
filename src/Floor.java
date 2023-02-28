public class Floor {
    private double width;
    private double length;

    public Floor(double w, double l) {
        /*
        In case the width parameter is less than 0 it needs to set the width
        field value to 0, in case the length parameter is less than 0 it needs
        to set the length field value to 0.
         */
        this.length = l < 0 ? 0 : l;
        this.width = w < 0 ? 0 : w;
    }
    public double getArea () {
        return this.width * this.length;
    }


}
