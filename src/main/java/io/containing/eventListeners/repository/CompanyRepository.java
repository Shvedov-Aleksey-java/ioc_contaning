package io.containing.eventListeners.repository;
import io.containing.eventListeners.model.Company;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public class CompanyRepository {
    public Optional<Company> findById(Integer id) {
        System.out.println("Find Company by id: " + id);
        return Optional.of(new Company(id));
    }
}
