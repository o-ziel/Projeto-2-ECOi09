package com.repo.restaurantapp;

/**
 * @author Oziel Ferreira da Silva
 * @author Willian Luiz Silva Texeira
 * @author Luís Gaspar da Cruz
 */
public interface ProductBuilder {
    /**
     * Builds a Product.
     *
     * @param N Number of product to be builded.
     * @return {Product} A Product.
     */
    public Product Create(Integer N);
}
