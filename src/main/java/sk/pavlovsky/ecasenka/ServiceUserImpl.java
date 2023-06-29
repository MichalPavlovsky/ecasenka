package sk.pavlovsky.ecasenka;

import org.springframework.stereotype.Service;
import sk.pavlovsky.ecasenka.dto.MapperUser;
import sk.pavlovsky.ecasenka.dto.UserDto;
import sk.pavlovsky.ecasenka.modul.User;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceUserImpl implements ServiceUser{

    UserRepository userRepository;
    MapperUser mapperUser;

    public ServiceUserImpl(UserRepository userRepository, MapperUser mapperUser) {
        this.userRepository = userRepository;
        this.mapperUser = mapperUser;
    }

    @Override
    public UserDto addUser(UserDto userDto) {
        return mapperUser.userToUserDto(userRepository.save(mapperUser.userDtoToUser(userDto)));
    }

    @Override
    public List<UserDto> getAllUser() {
        return userRepository.findAll().stream().map(mapperUser::userToUserDto).collect(Collectors.toList());
    }


}
