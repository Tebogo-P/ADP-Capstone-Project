package za.ac.cput.repository.impl;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Customer;
import za.ac.cput.factory.CustomerFactory;
import static org.junit.jupiter.api.Assertions.*;

class CustomerRepositoryImplTest {

    private final CustomerRepositoryImpl repository = new CustomerRepositoryImpl();

    @Test
    void testCRUD() {
        Customer customer = CustomerFactory.createCustomer(
                "Siphamandla",
                "sipha@email.com",
                "Cape Town"
        );

        Customer created = repository.create(customer);
        assertNotNull(created);

        Customer read = repository.read(created.getCustomerId());
        assertNotNull(read);

        Customer updated = new Customer.Builder()
                .copy(read)
                .setName("Updated")
                .build();

        repository.update(updated);
        assertEquals("Updated", repository.read(updated.getCustomerId()).getName());

        assertTrue(repository.delete(updated.getCustomerId()));
    }
}
