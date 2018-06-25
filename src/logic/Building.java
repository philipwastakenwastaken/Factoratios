package logic;

public class Building {

   private double craftingSpeed;
   private double[] consumptionArray, productionArray;
   private CraftingRecipe recipe;

   public Building(int craftingSpeed, CraftingRecipe recipe) {
      this.craftingSpeed = craftingSpeed;
      this.recipe = recipe;
      this.consumptionArray = new double[recipe.getInputList().size()];
      this.productionArray = new double[recipe.getOutputList().size()];
      calcConsumption();
      calcProduction();
   }

   private void calcConsumption(){
       for (int i = 0; i < recipe.getInputList().size(); i++) {
           consumptionArray[i] = craftingSpeed * recipe.getInputList().get(i) / recipe.getRecipeTime();
       }
   }

    private void calcProduction() {
        for (int i = 0; i < recipe.getInputList().size(); i++) {
            productionArray[i] = craftingSpeed * recipe.getOutputList().get(i) / recipe.getRecipeTime();
        }
    }

    // strongest input and output are the constraining factors in your setup
    public int getStrongestInputIndex() {
       return indexHelper(consumptionArray);
    }

    public int getStrongOutputIndex() {
       return indexHelper(consumptionArray);
    }

    private int indexHelper(double[] materialArray) {
        int index = 0;
        double max = 0;
        for (int i = 0; i < materialArray.length; i++) {
            if (materialArray[i] > max) {
                max = materialArray[i];
                index = i;
            }

        }
        return index;

    }

   // getters and setters from this point on

    public double getCraftingSpeed() {
       return craftingSpeed;
    }

    public void setCraftingSpeed(double craftingSpeed) {
        this.craftingSpeed = craftingSpeed;
    }

    public double[] getConsumptionArray() {
        return consumptionArray;
    }

    public void setConsumptionArray(double[] consumptionArray) {
        this.consumptionArray = consumptionArray;
    }

    public double[] getProductionArray() {
        return productionArray;
    }

    public void setProductionArray(double[] productionArray) {
        this.productionArray = productionArray;
    }

    public CraftingRecipe getRecipe() {
        return recipe;
    }

    public void setRecipe(CraftingRecipe recipe) {
        this.recipe = recipe;
    }
}
