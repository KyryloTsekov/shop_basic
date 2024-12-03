package app.repository;

import app.domain.Customer;

import java.util.List;

public interface CustomerRepository {

    // CRUD - Create, Read, ...

    Customer save(Customer customer);
    List<Customer> findAll();
    Customer findById(Long id);
    void update(Customer customer);
    void removeById(Long id);
}