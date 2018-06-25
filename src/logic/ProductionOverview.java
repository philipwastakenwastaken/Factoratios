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

    public double totalProduction(int strongInputIndex, int strongOutputIndex) {
        return buildingsForTotalBeltConsumption(strongInputIndex) * building.getProductionArray()[strongOutputIndex];
    }

    public double totalProductionInBelts(int strongInputIndex, int strongOutputIndex) {
        return totalProduction(strongInputIndex, strongOutputIndex) / beltSpeed;
    }

    public double[] totalProductionArray(int strongInputIndex) {
        ArrayList<Double> totalProductionArray = new ArrayList<Double>();
        for (double tempProduction : building.getProductionArray()) {
            totalProductionArray.add(buildingsForTotalBeltConsumption(strongInputIndex) * tempProduction);
        }
        return totalProductionArray.stream().mapToDouble(Double::doubleValue).toArray();
    }






}
