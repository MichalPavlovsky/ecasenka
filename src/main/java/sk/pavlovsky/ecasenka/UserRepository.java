package sk.pavlovsky.ecasenka;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import sk.pavlovsky.ecasenka.modul.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("SELECT u FROM User u WHERE u.firstName = :firstname AND u.lastName = :lastname")
    Optional<User> findByFirstNameAndLastName(@Param("firstname") String firstname, @Param("lastname") String lastname);

    @Query(value = "SELECT * FROM users WHERE role = 'Doctor'", nativeQuery = true)
    List<User> findAll();
    Optional<User> findByEmail(String email);

}
