package sk.pavlovsky.ecasenka.terms;

import org.springframework.data.jpa.repository.JpaRepository;
import sk.pavlovsky.ecasenka.modul.Term;

import java.util.List;

public interface RepoForTerm extends JpaRepository<Term, Integer> {
    List<Term> findByDoctorId(Integer doctorId);
}
