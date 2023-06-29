package sk.pavlovsky.ecasenka.dataFromDB;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import sk.pavlovsky.ecasenka.UserRepository;
import sk.pavlovsky.ecasenka.dto.UserDto;
import sk.pavlovsky.ecasenka.modul.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/get")
@RequiredArgsConstructor
public class DataController {

    private final UserRepository repository;

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
