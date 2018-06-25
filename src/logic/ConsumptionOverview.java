package logic;

public class ConsumptionOverview extends MaterialOverview {

    private Building building;
    private double beltSpeed;
    private int numOfBelts;

    public ConsumptionOverview(Building building, double beltSpeed, int numOfBelts) {
        super(building, beltSpeed, numOfBelts);
        this.building = building;
        this.beltSpeed = beltSpeed;
        this.numOfBelts = numOfBelts;
    }

    // returns
    public double totalConsumption(int strongInputIndex, int strongOutputIndex) {
        return 0;
    }

}
