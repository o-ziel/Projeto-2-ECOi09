package com.repo.restaurantapp;

import java.util.ArrayList;

/**
 * @author Oziel Ferreira da Silva
 * @author Willian Luiz Silva Texeira
 * @author Luís Gaspar da Cruz
 */
public class ProductFacade {
    /**
     * Method for returning the products from Kitchen.
     *
     * @param B A ProductObserver (Observer).
     * @return {ArrayList<(Product)>} An ArrayList with all the Kitchen products.
     */
    public ArrayList<Product> KitchenProducts(ProductObserver B) {
        return B.watchers.get(new Admin().STATUS_OP[1]);
    }

    /**
     * Method for returning the products from Bench.
     *
     * @param B A ProductObserver (Observer).
     * @return {ArrayList<(Product)>} An ArrayList with all the Bench products.
     */
    public ArrayList<Product> BenchProducts(ProductObserver B) {
        return B.watchers.get(new Admin().STATUS_OP[0]);
    }
}
