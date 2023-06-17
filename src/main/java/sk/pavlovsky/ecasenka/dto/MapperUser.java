package sk.pavlovsky.ecasenka.dto;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import sk.pavlovsky.ecasenka.modul.User;

@Mapper
public interface MapperUser {
    MapperUser INSTANCE = Mappers.getMapper(MapperUser.class);

    UserDto userToUserDto(User user);
    User userDtoToUser(UserDto userDto);
}
