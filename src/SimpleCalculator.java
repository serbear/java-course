public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber () {
        return secondNumber;
    }

    public void setFirstNumber(double value) {
        this.firstNumber = value;
    }
    public void setSecondNumber(double value) {
        this.secondNumber =  value;
    }

    public double getAdditionResult() {
        return this.secondNumber + this.firstNumber;
    }

    public double getSubtractionResult() {
        return this.firstNumber - this.secondNumber;
    }

    public double getMultiplicationResult() {
        return this.firstNumber * this.secondNumber;
    }

    public double getDivisionResult () {
        if (this.secondNumber == 0) return 0;
        return this.firstNumber / this.secondNumber;
    }

}
