package za.ac.cput.repository;

import za.ac.cput.domain.Customer;
import java.util.Set;

public interface ICustomerRepository {
    Customer create(Customer customer);
    Customer read(String customerId);
    Customer update(Customer customer);
    boolean delete(String customerId);
    Set<Customer> getAll();
}
