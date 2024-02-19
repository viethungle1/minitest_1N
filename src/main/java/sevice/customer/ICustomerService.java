package sevice.customer;

import model.Customer;

import java.sql.SQLException;
import java.util.List;

public interface ICustomerService {
    void addCustomer(Customer customer);
    Customer selectCustomer(int id);
    void updateCustomer(Customer book);
    void deleteCustomer(int id) throws SQLException;
    List<Customer> findAll();
}
