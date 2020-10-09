package th.ac.kmitl.atm;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DataSourceFile implements DataSource {
    public Map<Integer, Customer> readCustomer() {
        Map<Integer, Customer> customers = new HashMap<>();

        customers.put(1, new Customer(1, "Com", 1234, 1000));
        customers.put(2, new Customer(2, "leena", 5678, 3000));
        customers.put(3, new Customer(3, "Sem", 9123, 5000));


        return customers;
    }

    @Override
    public Map<Integer, Customer> readCustomers() {
        return null;
    }
}