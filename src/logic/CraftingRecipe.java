package logic;

import java.util.ArrayList;

public class CraftingRecipe {

    public ArrayList<Integer> getInputList() {
        return inputList;
    }

    public void setInputList(ArrayList<Integer> inputList) {
        this.inputList = inputList;
    }

    public ArrayList<Integer> getOutputList() {
        return outputList;
    }

    public void setOutputList(ArrayList<Integer> outputList) {
        this.outputList = outputList;
    }

    public double getRecipeTime() {
        return recipeTime;
    }

    public void setRecipeTime(double recipeTime) {
        this.recipeTime = recipeTime;
    }

    private ArrayList<Integer> inputList, outputList;
    private double recipeTime;

    public CraftingRecipe(ArrayList<Integer> inputList, ArrayList<Integer> outputList, double recipeTime) {
        this.inputList = inputList;
        this.outputList = outputList;
        this.recipeTime = recipeTime;
    }


}
