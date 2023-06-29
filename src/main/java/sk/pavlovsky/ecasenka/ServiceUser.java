package sk.pavlovsky.ecasenka;

import sk.pavlovsky.ecasenka.dto.UserDto;

import java.util.List;


public interface ServiceUser {
    UserDto addUser(UserDto userDto);

    List<UserDto> getAllUser();


}
