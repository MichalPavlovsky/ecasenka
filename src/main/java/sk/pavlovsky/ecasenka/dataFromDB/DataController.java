package sk.pavlovsky.ecasenka.dataFromDB;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import sk.pavlovsky.ecasenka.UserRepository;
import sk.pavlovsky.ecasenka.config.TermService;
import sk.pavlovsky.ecasenka.dto.TermDto;
import sk.pavlovsky.ecasenka.dto.UserDto;
import sk.pavlovsky.ecasenka.modul.Term;
import sk.pavlovsky.ecasenka.modul.User;
import sk.pavlovsky.ecasenka.terms.RepoForTerm;
import sk.pavlovsky.ecasenka.terms.TermRequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/get")
@RequiredArgsConstructor
public class DataController {

    private final UserRepository repository;
    private final RepoForTerm repoForTerm;

    private final TermService termService;

    @PostMapping("/getterms")
    public List<TermDto> getTerms(@RequestBody Map<String, Integer> request){
        int idDoctor = request.get("id");
        return termService.getListOfTerms(idDoctor);
    }


    @PostMapping("/term")
    public void addTerm(@RequestBody TermRequestBody requestBody){
        User doctor = repository.findById(requestBody.getIdDoctor()).orElse(null);
        User patient = repository.findById(requestBody.getIdPatient()).orElse(null);
        var term = Term.builder().time(requestBody.getTime())
                .date(requestBody.getDate()).doctor(doctor).patient(patient).build();
        repoForTerm.save(term);
    }

    @GetMapping("/doctors")
    public List<UserDto> getDoctorsName(){
        List<User> doctors = repository.findAll();
        List<UserDto> doctorDtos = new ArrayList<>();

        for (User doctor : doctors) {
            UserDto dto = new UserDto(doctor.getFirstName(), doctor.getLastName());
            doctorDtos.add(dto);
        }

        return doctorDtos;
}
    @PostMapping("/getid")
    public int getId(@RequestBody Map<String, String> request) {
        String firstname = request.get("firstname");
        String lastname = request.get("lastname");
        Optional<User> user = repository.findByFirstNameAndLastName(firstname, lastname);

        if (user.isPresent()) {
            return user.get().getId();
        } else {
            return 0;
        }
    }

}
