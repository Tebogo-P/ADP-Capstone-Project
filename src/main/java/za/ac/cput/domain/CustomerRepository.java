package za.ac.cput.repository;

import za.ac.cput.domain.Customer;
import java.util.HashSet;
import java.util.Set;

public class CustomerRepository implements ICustomerRepository {
    private static CustomerRepository repository;
    private Set<Customer> customerDB=new HashSet<>();

    private CustomerRepository(){}

    public static CustomerRepository getRepository(){
        if(repository==null) repository=new CustomerRepository();
        return repository;
    }

    public Customer create(Customer customer){customerDB.add(customer);return customer;}
    public Customer read(String id){
        for(Customer c:customerDB) if(c.getCustomerId().equals(id)) return c;
        return null;
    }
    public Customer update(Customer customer){
        Customer old=read(customer.getCustomerId());
        if(old!=null){customerDB.remove(old);customerDB.add(customer);return customer;}
        return null;
    }
    public boolean delete(String id){
        Customer c=read(id);
        if(c==null) return false;
        customerDB.remove(c);
        return true;
    }
    public Set<Customer> getAll(){return customerDB;}
}
