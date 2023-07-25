package sk.pavlovsky.ecasenka.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private String firstName;
    private String lastName;

    private int id;

//    public UserDto(String firstName, String lastName, String id) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.id = id;
//    }
}
