package in.parasgargsrm.springboot.repository;

import in.parasgargsrm.springboot.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepo extends JpaRepository<Customer, Long> {
}