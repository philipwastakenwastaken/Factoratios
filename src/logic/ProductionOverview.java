package logic;

import java.util.ArrayList;

public class ProductionOverview extends MaterialOverview {

    private Building building;
    private double beltSpeed;
    private int numOfBelts;

    public ProductionOverview(Building building, double beltSpeed, int numOfBelts) {
        super(building, beltSpeed, numOfBelts);
        this.building = building;
        this.beltSpeed =  beltSpeed;
        this.numOfBelts = numOfBelts;
    }

    // returns the total output of an desired material (input is one belt)
    public double totalProduction(int strongInputIndex, int strongOutputIndex) {
        return buildingsForTotalBeltConsumption(strongInputIndex) * building.getProductionArray()[strongOutputIndex];
    }
    // returns how many belts the output amounts to
    public double totalProductionInBelts(int strongInputIndex, int strongOutputIndex) {
        return totalProduction(strongInputIndex, strongOutputIndex) / beltSpeed;
    }

    // returns the production of ALL outputs
    public double[] totalProductionArray(int strongInputIndex) {
        ArrayList<Double> totalProductionArray = new ArrayList<>();
        for (double tempProduction : building.getProductionArray()) {
            totalProductionArray.add(buildingsForTotalBeltConsumption(strongInputIndex) * tempProduction);
        }
        return totalProductionArray.stream().mapToDouble(Double::doubleValue).toArray();
    }






}
