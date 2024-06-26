package ru.zinoviev.spring.securityrestjwt.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.zinoviev.spring.securityrestjwt.entities.User;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByUsername(String username);

}
