package com.repo.restaurantapp;

/**
 * @author Oziel Ferreira da Silva
 * @author Willian Luiz Silva Texeira
 * @author Luís Gaspar da Cruz
 */
public class ProductBuilderImpl implements ProductBuilder {
    /**
     * Builds a Product.
     *
     * @param N Number of product to be produced.
     * @return {Product} A Product.
     */
    @Override
    public Product Create(Integer N) {
        switch (N) {
            case 1:
                return new Product(14.5, "FILÉ DE FRANGO", new Admin(0).STATUS_OP[1]);
            case 2:
                return new Product(17.5, "FILÉ DE PEIXE", new Admin(0).STATUS_OP[1]);
            case 3:
                return new Product(19.5, "BIFE À MILANESA", new Admin(0).STATUS_OP[1]);
            case 4:
                return new Product(19.5, "BIFE À PARMEGIANA", new Admin(0).STATUS_OP[1]);
            case 5:
                return new Product(47.5, "VINHO FRANCÊS", new Admin(0).STATUS_OP[0]);
            case 6:
                return new Product(27.5, "VINHO INGLÊS", new Admin(0).STATUS_OP[0]);
            case 7:
                return new Product(29.0, "VINHO PORTUGUÊS", new Admin(0).STATUS_OP[0]);
            case 8:
                return new Product(0.0, "ÁGUA", new Admin(0).STATUS_OP[0]);
            default:
                return null;
        }
    }
}
