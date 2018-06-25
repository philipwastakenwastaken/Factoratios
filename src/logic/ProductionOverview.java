package logic;

import java.util.ArrayList;

public class ProductionOverview extends MaterialOverview {

    private Building building;
    private double beltSpeed;
    // number of INPUT belts
    private int numOfBelts;

    public ProductionOverview(Building building, double beltSpeed, int numOfBelts) {
        super(building, beltSpeed, numOfBelts);
        this.building = building;
        this.beltSpeed =  beltSpeed;
        this.numOfBelts = numOfBelts;
    }

    // returns the total output of an desired material given the number of belts
    public double totalProduction(int strongInputIndex, int strongOutputIndex) {
        return buildingsForOneBeltConsumption(strongInputIndex) * building.getProductionArray()[strongOutputIndex]
                * numOfBelts;
    }

    // returns how many belts the output amounts to
    public double totalProductionInBelts(int strongInputIndex, int strongOutputIndex) {
        return totalProduction(strongInputIndex, strongOutputIndex) / beltSpeed;
    }

    // returns the production of ALL outputs
    public double[] totalProductionArray(int strongInputIndex) {
        ArrayList<Double> totalProductionArray = new ArrayList<>();
        for (double tempProduction : building.getProductionArray()) {
            totalProductionArray.add(buildingsForOneBeltConsumption(strongInputIndex) * tempProduction);
        }
        return totalProductionArray.stream().mapToDouble(Double::doubleValue).toArray();
    }






}
