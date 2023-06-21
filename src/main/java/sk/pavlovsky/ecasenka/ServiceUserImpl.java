//package sk.pavlovsky.ecasenka;
//
//import org.springframework.stereotype.Service;
//import sk.pavlovsky.ecasenka.dto.MapperUser;
//import sk.pavlovsky.ecasenka.dto.UserDto;
//
//@Service
//public class ServiceUserImpl implements ServiceUser{
//
//    UserRepository userRepository;
//    MapperUser mapperUser;
//
//    public ServiceUserImpl(UserRepository userRepository, MapperUser mapperUser) {
//        this.userRepository = userRepository;
//        this.mapperUser = mapperUser;
//    }
//
//    @Override
//    public UserDto addUser(UserDto userDto) {
//        return mapperUser.userToUserDto(userRepository.save(mapperUser.userDtoToUser(userDto)));
//    }
//}
