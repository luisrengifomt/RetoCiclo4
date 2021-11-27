package Reto1;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 *
 * @author LuisR
 */
public interface UserCrudRepository extends CrudRepository <User, Integer> {
    Optional<User> findByEmail (String email);
    Optional<User> findByEmailAndPassword (String email, String password);
}
