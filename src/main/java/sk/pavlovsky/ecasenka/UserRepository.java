package sk.pavlovsky.ecasenka;

import org.springframework.data.jpa.repository.JpaRepository;
import sk.pavlovsky.ecasenka.modul.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
