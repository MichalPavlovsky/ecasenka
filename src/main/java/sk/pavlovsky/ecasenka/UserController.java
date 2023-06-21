//package sk.pavlovsky.ecasenka;
//
//
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import sk.pavlovsky.ecasenka.dto.UserDto;
//
//
//@RestController
//@RequestMapping("/users")
//public class UserController {
//    ServiceUser serviceUser;
//
//    public UserController(ServiceUser serviceUser) {
//        this.serviceUser = serviceUser;
//    }
//
//    @PostMapping
//    UserDto addUser(@RequestBody UserDto userDto) {
//        return serviceUser.addUser(userDto);
//    }
//
//}
//
