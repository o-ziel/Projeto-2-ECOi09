package com.repo.restaurantapp;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Oziel Ferreira da Silva
 * @author Willian Luiz Silva Texeira
 * @author Luís Gaspar da Cruz
 */
public class Admin {
    public String STATUS_OP[] = {"BANCADA", "EM PREPARO", "ENTREGUE", "PAGO"};

    public ArrayList<Product> PRODUCTS = new ArrayList<>();
    public Integer NUMBER_OF_TABLES = 10;
    ArrayList<String> PRODUCT_PLATES = new ArrayList<>();

    public Admin(Integer S) {
    }

    public Admin() {
        ProductBuilderImpl PB = new ProductBuilderImpl();
        this.update(
                PB.Create(1),
                PB.Create(2),
                PB.Create(3),
                PB.Create(4),
                PB.Create(5),
                PB.Create(6),
                PB.Create(7),
                PB.Create(8)
        );

        PRODUCTS.forEach((Product P) -> {
            PRODUCT_PLATES.add(P.PRODUCT_NAME + " - R$" + P.PRIZE);
        });
    }

    /**
     * Adiciona os produtos passados como parâmetro.
     *
     * @param product A product or various products in an array.
     */
    private void update(Product... product) {
        PRODUCTS.addAll(Arrays.asList(product));
    }
}
