package logic;

public abstract class MaterialOverview {

    private Building building;
    private double beltSpeed;
    private int numOfBelts;

    public MaterialOverview(Building building, double beltSpeed, int numOfBelts) {
        this.building = building;
        this.beltSpeed = beltSpeed;
        this.numOfBelts = numOfBelts;
    }

    public double buildingsForTotalBeltConsumption(int strongInputIndex) {
        return beltSpeed / building.getConsumptionArray()[strongInputIndex];
    }

}
