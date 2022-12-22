package product;

import java.util.HashMap;
import java.util.Objects;
import java.util.Set;
import java.util.Set;
public class Recipe {

    private HashMap <Product, Integer> productsMap;
    private double sumProducts;

    public Recipe(String name) {
        this.productsMap = new HashMap<>();
        this.name = name;

    }

    public HashMap<Product, Integer> getProductsMap() {
        return productsMap;
    }

    public double getSumProducts() {
        return sumProducts;
    }

    private String name;

    private int listOfRecipe;

    private int totalCost;

    public Recipe(String name, int listOfRecipe, int totalCost) {
        setName(name);
        setListOfRecipe(listOfRecipe);
        setTotalCost(totalCost);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getListOfRecipe() {
        return listOfRecipe;
    }

    public void setListOfRecipe(int listOfRecipe) {
        this.listOfRecipe = listOfRecipe;
    }

    public int getTotalCost() {
        return totalCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return name.equals(recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productsMap, sumProducts, name);
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "name='" + name + '\'' +
                '}';
    }
}


