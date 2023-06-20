package sk.pavlovsky.ecasenka;

import org.springframework.data.jpa.repository.JpaRepository;
import sk.pavlovsky.ecasenka.modul.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);

}
