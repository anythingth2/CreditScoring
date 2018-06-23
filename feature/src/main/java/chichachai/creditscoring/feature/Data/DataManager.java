package chichachai.creditscoring.feature.Data;

import chichachai.creditscoring.feature.Data.Models.Customer;

public class DataManager {
    private static Customer customer;

    public static Customer getCustomer() {
        return customer;
    }

    public static void setCustomer(Customer customer) {
        DataManager.customer = customer;
    }


}
