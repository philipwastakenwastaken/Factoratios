package logic;

import java.util.ArrayList;

public class ConsumptionOverview extends MaterialOverview {

    private Building building;
    private double beltSpeed;
    // number of OUTPUT belts
    private int numOfBelts;

    public ConsumptionOverview(Building building, double beltSpeed, int numOfBelts) {
        super(building, beltSpeed, numOfBelts);
        this.building = building;
        this.beltSpeed = beltSpeed;
        this.numOfBelts = numOfBelts;
    }

    // returns the total consumption of a given material, given the total number of output belts
    public double totalConsumption(int strongInputIndex, int strongOutputIndex) {
        return (beltSpeed * numOfBelts/ building.getProductionArray()[strongInputIndex])
               * building.getConsumptionArray()[strongOutputIndex];

    }

    // returns total consumption in amount of belts
    public double totalConsumptionInBelts(int strongInputIndex, int strongOutputIndex) {
        return totalConsumption(strongInputIndex, strongOutputIndex) / beltSpeed;
    }

    // returns the consumption of ALL inputs
    public double[] totalConsumptionArray(int strongOutputIndex) {
        ArrayList<Double> totalConsumptionArray = new ArrayList<>();
        for (double tempConsumption : building.getConsumptionArray()) {
            totalConsumptionArray.add(beltSpeed * numOfBelts / tempConsumption
            * building.getConsumptionArray()[strongOutputIndex]);
        }
        return totalConsumptionArray.stream().mapToDouble(Double::doubleValue).toArray();
    }

}
