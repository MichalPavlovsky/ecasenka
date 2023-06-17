package sk.pavlovsky.ecasenka.dto;

import org.junit.Test;
import sk.pavlovsky.ecasenka.modul.User;

import static org.junit.Assert.*;

public class MapperUserTest {
    @Test
    public void userToUserDto(){
        User user = new User();
        user.setName("Michal");

        UserDto userDto = MapperUser.INSTANCE.userToUserDto(user);
        assertEquals(userDto.getName(),user.getName());
    }

}