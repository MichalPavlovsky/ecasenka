package sk.pavlovsky.ecasenka.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private String fullName;

    public UserDto(String firstName, String lastName) {
        this.fullName = firstName + " " + lastName;
    }
}
