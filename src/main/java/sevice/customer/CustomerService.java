package sevice.customer;
import config.ConnectionJDBC;
import model.Customer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerService implements ICustomerService {
    public static final String SELECT_CUSTOMER = "select c.id, c.name as name,c.address, c.email, c.phone,p.name as provice from customer c join provice p on c.provice_id = p.id;";
    Connection c = ConnectionJDBC.getConnection();
    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = new ArrayList<>();
        try {
            PreparedStatement statement = c.prepareStatement(SELECT_CUSTOMER);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String address = rs.getString("address");
                String email = rs.getString("email");
                String phone = rs.getString("phone");
                String provice = rs.getString("provice");
                Customer customer = new Customer(id,name,address,email,phone,provice);
                customerList.add(customer);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return customerList;
    }

    @Override
    public void addCustomer(Customer customer) {

    }

    @Override
    public Customer selectCustomer(int id) {
        return null;
    }

    @Override
    public void updateCustomer(Customer book) {

    }

    @Override
    public void deleteCustomer(int id) throws SQLException {

    }
}
