package th.ac.kmitl.atm;

import java.util.HashMap;
import java.util.Map;

public class DataSourceDB implements DataSource {

    public Map<Integer,Customer> readCustomers() {
        Map<Integer,Customer> customers = new HashMap<>();

        customers.put(1,new Customer(1,"คอม",1234,1000));
        customers.put(2,new Customer(2,"ลีน่า",2345,2000));
        customers.put(3,new Customer(3,"เซม",3456,3000));

        return customers;
    }
}
