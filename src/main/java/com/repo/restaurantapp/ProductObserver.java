package com.repo.restaurantapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Oziel Ferreira da Silva
 * @author Willian Luiz Silva Texeira
 * @author Luís Gaspar da Cruz
 */
public class ProductObserver {

    Map<String, ArrayList<Product>> watchers = new HashMap<>();

    /**
     * Creates an Observer.
     *
     * @param Operations A String or a String array to be mapped.
     */
    public ProductObserver(String... Operations) {
        for (String Operation : Operations)
            this.watchers.put(Operation, new ArrayList<>());
    }

    /**
     * Subscribes watchers to a key.
     *
     * @param Event    String that was already mapped (key).
     * @param PRODUCTS Product or a Product array to be added to the ArrayList.
     */
    public void subscribe(String Event, Product... PRODUCTS) {
        for (Product P : PRODUCTS)
            watchers.get(Event).add(P);
    }

    /**
     * Unsubscribes watchers from a key.
     *
     * @param Event    String that was already mapped (key).
     * @param PRODUCTS Product or a Product array to be added to the ArrayList.
     */
    public void unsubscribe(String Event, Product... PRODUCTS) {
        for (Product P : PRODUCTS)
            watchers.get(Event).remove(P);
    }

    /**
     * Notificates and changes the status of all the members from the Old (key) parameter to the
     * New (key) parameter.
     *
     * @param Old String that was already mapped (key).
     * @param New String that was already mapped (key).
     */
    public void notificate(String Old, String New) {
        ArrayList<Product> members = watchers.get(Old);
        members.forEach((Product watcher) -> {
            watcher.update(New);
        });
        this.unsubscribe(Old, members.toArray(new Product[0]));
        this.subscribe(New, members.toArray(new Product[0]));
    }
}
