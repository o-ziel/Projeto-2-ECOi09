package com.repo.restaurantapp;

/**
 * @author Oziel Ferreira da Silva
 * @author Willian Luiz Silva Texeira
 * @author Luís Gaspar da Cruz
 */
public class Product {
    String PRODUCT_NAME, PRODUCT_STATUS;

    Integer NUMBER = 0;

    Double PRIZE = 0.00;

    /**
     * Constructor with parameters, needs PRIZE, PRODUCT_NAME and PRODUCT_STATUS
     * to be defined.
     *
     * @param pr Product prize.
     * @param pn Product name.
     * @param ps Product status.
     */
    public Product(Double pr, String pn, String ps) {
        this.PRIZE = pr;
        this.PRODUCT_NAME = pn;
        this.PRODUCT_STATUS = ps;
    }

    /**
     * Constructor with an object of the same type as parameter.
     *
     * @param p A Product object.
     */
    public Product(Product p) {
        this.setProductName(p.PRODUCT_NAME);
        this.PRODUCT_STATUS = p.PRODUCT_STATUS;
        this.setProductPrize(p.PRIZE);
    }

    /**
     * Setter for the Product STATUS.
     *
     * @param New Product status.
     */
    public void update(String New) {
        PRODUCT_STATUS = New;
    }

    /**
     * Getter for the Product NAME.
     *
     * @return {String} Product name.
     */
    public String getProductName() {
        return PRODUCT_NAME;
    }

    /**
     * Setter for the Product NAME.
     *
     * @param pn Product name.
     */
    public void setProductName(String pn) {
        PRODUCT_NAME = pn;
    }

    /**
     * Getter for the Product PRIZE.
     *
     * @return {Double} Product prize.
     */
    public Double getProductPrize() {
        return PRIZE;
    }

    /**
     * Setter for the Product PRIZE.
     *
     * @param p Product prize.
     */
    public void setProductPrize(Double p) {
        PRIZE = p;
    }

    /**
     * Overrides toString() method to return the Product as a String.
     *
     * @return {String} ProductNumber - ProductName - ProductStatus - R$ProductPrize.
     */
    @Override
    public String toString() {
        return String.format("%05d", NUMBER) + " - " + PRODUCT_NAME + " - " + PRODUCT_STATUS +
                " - R$" + PRIZE;
    }
}
