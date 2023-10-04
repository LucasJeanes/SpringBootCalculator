package ie.atu.springbootcalculator;

public class CalculatorData {
    private float result;
    private String operation;

    public CalculatorData(float result, String operation) {
        this.result = result;
        this.operation = operation;
    }

    public float getResult() {
        return result;
    }

    public String getOperation() {
        return operation;
    }
}
