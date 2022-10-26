package security_demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import security_demo.models.Person;

import java.util.Optional;

public interface PeopleRepo extends JpaRepository<Person, Integer> {
    Optional<Person> findByUsername(String username);
}
