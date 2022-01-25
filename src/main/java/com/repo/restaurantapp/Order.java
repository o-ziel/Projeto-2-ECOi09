package com.repo.restaurantapp;

import java.util.ArrayList;

/**
 * @author Oziel Ferreira da Silva
 * @author Willian Luiz Silva Texeira
 * @author Luís Gaspar da Cruz
 */
public class Order {
    ArrayList<Product> Products = new ArrayList<>();
    ProductObserver STATUS = new ProductObserver(new Admin().STATUS_OP);

    Integer NUMBER = -1, TABLE = -1;
    String NAME = "";    Double PRIZE = this.getPrize();
    Boolean ACTIVE = true;

    public Order() {
    }

    /**
     * Default constructor with NUMBER and TABLE parameters defined.
     *
     * @param n Order number.
     * @param z Table number.
     */
    public Order(Integer n, Integer z) {
        this.setOrderNumber(n);
        this.setTable(z);
    }

    /**
     * Setter for the Table number.
     *
     * @param n Table number.
     */
    private void setTable(Integer n) {
        this.TABLE = n;
    }

    /**
     * Getter for the Order number.
     *
     * @return {Integer} Order number.
     */
    public Integer getOrderNumber() {
        return NUMBER;
    }

    /**
     * Setter for the Order number.
     *
     * @param n Order number.
     */
    private void setOrderNumber(Integer n) {
        this.NUMBER = n;
    }

    /**
     * Getter for the Order prize.
     *
     * @return {Double} Order prize.
     */
    public Double getPrize() {
        PRIZE = 0.00;
        Products.forEach(P -> {
            PRIZE += P.PRIZE;
        });
        return PRIZE;
    }

    /**
     * Overrides toString() method to return the Order as a String.
     *
     * @return {String} OrderNumber - OrderName - R$OrderPrize.
     */
    @Override
    public String toString() {
        return String.format("%05d", NUMBER) + " - " + NAME + " - R$" + PRIZE;
    }


}
